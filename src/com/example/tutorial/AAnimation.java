package com.example.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;

import com.example.tutorial.R;

public class AAnimation 
{
	//animation for shorea
	public static void startAAnimation(int a)
	{
		if(a==1)
		{
			if(MainActivity.parrotWay == 10)
			{
				Functions.letter(11, 1, MainActivity.letter3, 
						MainActivity.letter3.getX(), MainActivity.letter4.getX()-MainActivity.letter3.getWidth(),
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5-100);
			
				//6
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.t2a4, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 7)
			{
				Functions.letter(8, 2, MainActivity.letter4,
						MainActivity.letter4.getX(), MainActivity.letter4Pos,
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5-100);
			
			}
			else if(MainActivity.parrotWay == 4)
			{
				Functions.letter(5, 1, MainActivity.letter2, MainActivity.letter2.getX(), 
						MainActivity.letter1Pos+MainActivity.letter1.getWidth(),
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5 - 100);
				
				//4
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.t2aa2, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 1)
			{ 
				Functions.letter(2, 1, MainActivity.letter1, MainActivity.letter1.getX(), 
						MainActivity.letter1Pos,
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5 - 100);
			
				//3
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2aa1, MainActivity.MainActivityInstace);
			}
		
		}
		
		
		else if(a==2)
		{
			//ends here
			if(MainActivity.parrotWay == 11)
			{
				MainActivity.mScene.registerUpdateHandler(new TimerHandler(3, new ITimerCallback()
				{
					
					@Override
					public void onTimePassed(TimerHandler pTimerHandler) 
					{
						// TODO Auto-generated method stub
						Functions.path(12, MainActivity.parrot, 
								MainActivity.letter3Pos, MainActivity.parrotHeight,
								MainActivity.CAMERA_WIDTH+100, MainActivity.parrotHeight,
								MainActivity.CAMERA_WIDTH+100, MainActivity.parrotHeight
			 					);  
					}
				}));
				
			}
			else if(MainActivity.parrotWay == 8)
			{
				Functions.parrotPath(9, (float) 0.1, 2, MainActivity.parrot, 
						MainActivity.letter4Pos, -150,
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
				
			}
			else if(MainActivity.parrotWay == 5)
			{
				Functions.parrotPath(6, (float) 0.5, 5, MainActivity.parrot, 
						MainActivity.letter2Pos,
						MainActivity.CAMERA_WIDTH+150,
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
				
			} 
			else if(MainActivity.parrotWay == 2)
			{
				Functions.parrotPath(3, (float) 0.0 , 2, MainActivity.parrot, MainActivity.letter1Pos,
						-150, 
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
			}
		}
		
		
		else if(a==3)
		{
			if(MainActivity.parrotWay == 9)
			{
				Functions.parrotWithLetterPath(10, (float) 0.5,
						1, 2, MainActivity.letter3, MainActivity.parrot, -150, 
						MainActivity.letter3Pos, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);

			}
			else if(MainActivity.parrotWay == 6)
			{
			
				Functions.parrotWithLetterPath(7, (float) 0.1,
						0, 2, MainActivity.letter4, MainActivity.parrot, 
						MainActivity.CAMERA_WIDTH+150, MainActivity.letter4Pos, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);
				
				//5
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop3(R.raw.t1e3, R.raw.t1aa2_4, R.raw.t2a3, MainActivity.MainActivityInstace);
			} 
			else if(MainActivity.parrotWay == 3)
			{
				Functions.parrotWithLetterPath(4, (float) 0.1,
						1, 3, MainActivity.letter2,MainActivity.parrot, 
						-150, MainActivity.letter2Pos,
						MainActivity.parrotHeight, MainActivity.parrotHeight);
			}
		}
		
		
		else if(a==4)
		{

			if(MainActivity.parrotWay == 12)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.aa, MainActivity.MainActivityInstace); 
				
				Functions.Jump(MainActivity.letter1, 13);
			}
		}
		
		
	}
	
}
