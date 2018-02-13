#include<stdio.h>
#include<math.h>
int main(){
    int i,j,z,sf=0,modulo,sn=0,k,counter=0,temp=0,frames,m,bits,rarray[100],sarray[100],caseno,innercaseno,sw,rw,rn=0,sendframes,error=0;
    printf("enter the frames:\n");
    scanf("%d",&frames);

    printf("enter the number of bits to send:\n");
    scanf("%d",&m);

    modulo=pow(m,2);
    sw=pow(2,m-1);	//sender window size
    rw=sw;        	//receiver window size  
printf("sender's window size is:%d and receiver's window size is:%d\n",sw,rw);

    printf("\nthe sender's and the receiver's array is:\n");
    for(i=0;i<frames;i++){
    sarray[i]=i%modulo;
    printf("%d ",sarray[i]);
    }
    printf("\n");
    for(i=0;i<frames;i++){
    rarray[i]=i%modulo;
    printf("%d ",rarray[i]);
    }
 
    loop:

    	printf("\n1:sender\n2:receiver\n3:halt\n");
        scanf("%d",&caseno);
        switch(caseno){
     			case 1:
     			    	error=1;

     				printf("enter no.\n1:send frame\n2:frame lost\n3:timeout\n");
     				scanf("%d",&innercaseno);
     				
     				if(innercaseno==1)
     				{
     				printf("enter the number of frames to send:\n");
     				scanf("%d",&sendframes);
     				if(sendframes>sw)
     				{
     					printf("not possible\n");
     					goto loop;
     				}	
     				for(k=0;k<sendframes;k++)
     					{
                            if(sn-sf<sw)
                            {
                            	printf("sent frame:%d",sn);
                            	sn+=1; 							                      
                        		printf("\nsf-sn:\n");    
                        		
                        		for(i=sf;i<=sn;i++)
                        		printf("%d",sarray[i%modulo]);

	                           	if(temp!=0)
                            	printf("\nnegative acknowlegment:%d\n",sf);
                        				printf("\nthe sender window is:\n");
                        				if(frames<sf+sw)
                        				{
                        				for(i=sf;i<=frames;i++)
                        				printf("%d",sarray[i%modulo]);
                        				}
                        				else
                        				{
                        				for(i=sf;i<=sf+sw;i++)
                        				printf("%d",sarray[i%modulo]);
                           				}	

                        	}
                            else
                               printf("\ndiscarded\n");
						}
					}	
                    if(innercaseno==2)
                    {
                    	sn+=1;
                    	temp=sf;
                    }
                    if(innercaseno==3)
                    	goto loop;
                goto loop;
                case 2:
                	if(error==0)
                	{
                	printf("\nerror\n");
                	goto loop;
                	}
                	rn++;
                	printf("receiver side:\n1:pos ack\n2:nack");
                	scanf("%d",&innercaseno);

                	if(innercaseno==1)
                	{	rn=sn;
                		sf=sn;
                		printf("rn is:%d\n",rn);
                		printf("the receiver side window is:\n");
                		if(frames<rn+rw)
                		{
                			for(z=rn;z<frames;z++)
                			printf("%d\n",z%modulo);
                		}
                		else
                		{
                			sf=sn;
                			for(z=rn;z<rn+rw;z++)
                			printf("%d\n",z%modulo);
                		}	
//                		printf("\nsf is:%d,sn is:%d,rn is:%d\n",sf,sn,rn);
                	}					
                	else if(innercaseno==2)
                	{
                		rn+1;
                		printf("\nnegative  acknowlegment;%d\n",rn);
                		
                		printf("sleep(),resend frame:%d\n",rn-1);
                	
                	}
                	goto loop;
                case 3:
                	break;
                }
                return 0;
            }

