package com.example.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;

import com.example.tutorial.R;

public class EAnimation 
{
	public static void startEAnimation(int a)
	{
		if(a==1)
		{
			if(MainActivity.parrotWay == 13)
			{
				Functions.letter(14, 2, MainActivity.letter3, 
						MainActivity.letter3.getX(), MainActivity.letter4.getX()-MainActivity.letter3.getWidth(),
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5-100);
			
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2i3, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 10)
			{
				Functions.letter(11, 2, MainActivity.letter5, 
						MainActivity.letter5.getX(), MainActivity.letter4.getX()+MainActivity.letter4.getWidth()-33,
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5-100);
				
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2i2, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 7)
			{
				Functions.letter(8, 1, MainActivity.letter4, 
						MainActivity.letter4.getX(), MainActivity.letter4Pos,  
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5-100);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.t2i1, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 4)
			{
				Functions.letter(5, (float)1.5, MainActivity.letter1, 
						MainActivity.letter1.getX(), MainActivity.letter2.getX()-MainActivity.letter1.getWidth(),
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5 - 100);
			}
			else if(MainActivity.parrotWay == 1)
			{ 
				Functions.letter(2, 1, MainActivity.letter2, 
						MainActivity.letter2.getX(), MainActivity.letter2Pos-20,
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5 - 100);
			}
		}
		
		else if(a==2)
		{
			if(MainActivity.parrotWay == 11)
			{
				MainActivity.mScene.registerUpdateHandler(new TimerHandler(5, new ITimerCallback() 
				{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler)
					{
						// TODO Auto-generated method stub
						
						MainActivity.parrot.setFlippedHorizontal(false);
						
						Functions.parrotPath(12, (float) 0.1, 2, MainActivity.parrot, 
								MainActivity.letter3Pos, -150,
								MainActivity.parrotHeight,
								MainActivity.parrotHeight
								);
					}
				}));
				
			}
			else if(MainActivity.parrotWay == 8)
			{
				Functions.parrotPath(9, (float) 0.1, 2, MainActivity.parrot, 
						MainActivity.letter3Pos, -150,
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
			}
			else if(MainActivity.parrotWay == 5)
			{
				Functions.parrotPath(6, (float) 3.5, 4, MainActivity.parrot, MainActivity.letter1Pos,
						MainActivity.CAMERA_WIDTH+150,
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
			} 
			else if(MainActivity.parrotWay == 2)
			{
				Functions.parrotPath(3, (float) 0.1 , 2, MainActivity.parrot, 
						MainActivity.letter2Pos, -150, 
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
			}
		}
		
		
		else if(a==3)
		{
			if(MainActivity.parrotWay == 12)
			{
				Functions.parrotWithLetterPath(13, (float) 0.5,
						1, 2, MainActivity.letter3, MainActivity.parrot, 
						-150, MainActivity.letter3Pos-100, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);
			}
			else if(MainActivity.parrotWay == 9)
			{
				Functions.parrotWithLetterPath(10, (float) 1,
						1, 2, MainActivity.letter5, MainActivity.parrot, 
						-150, MainActivity.letter4Pos-100, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);
			}
			else if(MainActivity.parrotWay == 6)
			{
			
				Functions.parrotWithLetterPath(7, (float) 5,  
						0, 2, MainActivity.letter4, MainActivity.parrot, 
						MainActivity.CAMERA_WIDTH+150, MainActivity.letter3Pos, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.t1i1, MainActivity.MainActivityInstace);
			} 
			else if(MainActivity.parrotWay == 3)
			{
				Functions.parrotWithLetterPath(4, (float) 0.1,
						1, (float)1.5, MainActivity.letter1, MainActivity.parrot, 
						-150, MainActivity.letter1Pos,
						MainActivity.parrotHeight, MainActivity.parrotHeight);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.t2ii1, MainActivity.MainActivityInstace);
			}
		}
		
		
		else if(a==4)
		{
			
			if(MainActivity.parrotWay == 18)
			{
				MainActivity.mScene.registerUpdateHandler(new TimerHandler(5, new ITimerCallback() 
				{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler)
					{
						// TODO Auto-generated method stub
						
						SoundFunction.audioPlay = true; 
						SoundFunction.playAudio(R.raw.bo, MainActivity.MainActivityInstace);
						
						Functions.Jump(MainActivity.letter1, 19);
					}
				}));
				
			}
			else if(MainActivity.parrotWay == 14)
			{
				
				Functions.path(18, MainActivity.parrot, 
						MainActivity.letter3Pos-100, MainActivity.parrotHeight,
						MainActivity.CAMERA_WIDTH+100, MainActivity.parrotHeight,
						MainActivity.CAMERA_WIDTH+100, MainActivity.parrotHeight 
						);
//				SoundFunction.audioPlay = true;
//				SoundFunction.playAudio(R.raw.seven);
			} 
		}
	}
}
