#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main(){
    int g=0,counter=0,ncounter=0,z,i,j,k,ack,bits,m,frames,sf=0,sn=0,array[100],caseno,sendframes;
    printf("enter the frames:\n");
    scanf("%d",&frames);
    printf("enter m:\n");
    scanf("%d",&m);
    bits=pow(2,m);
    bits=bits-1;
    printf("the number of bits are:%d\n",bits);
    printf("the window frame is:");

    for(i=0;i<frames;i++){
    array[i]=i%bits;
    printf("%d",array[i]);
    }
    printf("\n");


    loop:
        printf("1:sender side\n2:reciever side\n3:halt 4:timer out\n");
        scanf("%d",&caseno);
        switch(caseno)
        {
            case 1:
            printf("sender side:\n");
            printf("enter 1:connection lost or frame lost\n2:timer out\n3:packet successfully send\n");
            scanf("%d",&k);
 
 //frame lost //connection lost

            if(k==1)
            goto loop;
            
//timer out
 
            else if(k==1)
            {
                    printf("the timer out:\n");
                    if(sf==sn)
                    goto loop;
                    if(sf!=sn)
                    {
                        for(z=sf;z<=sn;z++)
                        printf("frame sent %d\n",z%bits);
                    }
                    goto loop;
            

            }
 
//packet sent successfully
            printf("number of packets send\n");
            scanf("%d",&sendframes);
            if(sendframes>bits)
                    {
                        printf("not possible\n");
                        goto loop;
                    }   
            for(k=0;k<sendframes;k++){
            printf("sent packet:%d\n",counter);
            counter+=1;
            sn+=1;
            j=sf;
                                 printf("the frame from sf to sn is:");
                                 while(j<sn){
                                 printf("%d",j);
                                 j++;
            }
            printf("\n");
           
                                 printf("the sender window is:");
                                 for(z=sf;z<frames+sf;z++)
                                 printf("%d",z%bits);
                                 printf("\n");
        }
            //printf("window is %d to %d\n",sf,(sf+pbits-1)%pbits);

            goto loop;
        
/*
RECEIVER SIDE
*/
            case 2:


            if(sf==0&&sn==0){
                    printf("frame not yet recieved\n");
                    goto loop;
                    }
            printf("reciever side:\nenter 1 for positive acknowledgement and 0 for lost acknowlegement\n");
            scanf("%d",&ack);
            if(ack==0){
                ncounter+=1;
            }
            if(ack==1)
            {
                sf++;
                j=sf;
                printf("positive ack for frame:%d\n",j+ncounter);
                ncounter=0;
                printf("the sender window is:\n");
                for(z=sf;z<frames+sf;z++)
                printf("%d",z%bits);
                //printf("window is %d to %d\n",sf,(sf+bits-1)%bits);
                printf("\n");

                goto loop;
            }

            else{   
                
                for(z=sf;z<frames+sf;z++){
                printf("%d",z%bits);
                j++;
                }
                printf("\n");

                //printf("window is %d to %d",sf,(sf+bits-1)%bits);
                goto loop;

            }
/*
halt

*/      case 3:
        case 4:
                break;


        }
    return 0;
}


