package com.example.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;

import com.example.tutorial.R;

public class UAnimation 
{
	public static void startUAnimation(int a)
	{
		if(a==1)
		{
			if(MainActivity.parrotWay == 13)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2u5, MainActivity.MainActivityInstace);
				
				Functions.letter(14, 2, MainActivity.letter5, 
						MainActivity.letter5.getX(), MainActivity.letter5Pos-100,
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5-100);
			}
			else if(MainActivity.parrotWay == 10)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2u4, MainActivity.MainActivityInstace);
				
				Functions.letter(11, 2, MainActivity.letter4, 
						MainActivity.letter4.getX(), MainActivity.letter4Pos-65,
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5-100);
			}
			else if(MainActivity.parrotWay == 7)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2u3, MainActivity.MainActivityInstace);
				
				Functions.letter(8, 2, MainActivity.letter3, 
						MainActivity.letter3.getX(), MainActivity.letter3Pos+35, 
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5+10);
			}
			else if(MainActivity.parrotWay == 4)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2uu2, MainActivity.MainActivityInstace);
				
				Functions.letter(5, 4, MainActivity.letter2, 
						MainActivity.letter2.getX(), MainActivity.letter1.getX()+MainActivity.letter1.getWidth(),
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5 - 100);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop2(R.raw.uuanim3, R.raw.uuanim4, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 1)
			{ 
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.t2uu1, MainActivity.MainActivityInstace);
				
				Functions.letter(2, 2, MainActivity.letter1, 
						MainActivity.letter1.getX(), MainActivity.letter1Pos,
						MainActivity.CAMERA_HEIGHT / 2 -30, 
						MainActivity.CAMERA_HEIGHT-MainActivity.CAMERA_HEIGHT/5 - 100);
			}
		}
		
		else if(a==2)
		{
			if(MainActivity.parrotWay == 11)
			{
				MainActivity.parrot.setFlippedHorizontal(false);
				
				Functions.parrotPath(12, (float) 0.1, 2, MainActivity.parrot, 
						MainActivity.letter3Pos, -150,
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
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
				Functions.parrotPath(6, (float) 2, 2, MainActivity.parrot, MainActivity.letter2Pos,
						MainActivity.CAMERA_WIDTH+150,
						MainActivity.parrotHeight,
						MainActivity.parrotHeight
						);
				MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1.5, new ITimerCallback()
				{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler) 
					{
						// TODO Auto-generated method stub
//						SoundFunction.audioPlay = true;
//						SoundFunction.playAudio(R.raw.uuanim5, MainActivity.MainActivityInstace);
					}
				}));
				
			} 
			else if(MainActivity.parrotWay == 2)
			{
				Functions.parrotPath(3, (float) 0.1 , 2, MainActivity.parrot, MainActivity.letter1Pos,
						-150, 
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
						1, 2, MainActivity.letter5, MainActivity.parrot, 
						-150, MainActivity.letter5Pos-100, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);
				
//				SoundFunction.audioPlay = true;
//				SoundFunction.playAudio(R.raw.uuanim8, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 9)
			{
				Functions.parrotWithLetterPath(10, (float) 0.5,
						1, 2, MainActivity.letter4, MainActivity.parrot, 
						-150, MainActivity.letter4Pos-100, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);
				
//				SoundFunction.audioPlay = true;
//				SoundFunction.playAudio(R.raw.uuanim7, MainActivity.MainActivityInstace);
			}
			else if(MainActivity.parrotWay == 6)
			{
			
				Functions.parrotWithLetterPath(7, (float) 0.1,
						0, 2, MainActivity.letter3, MainActivity.parrot, 
						MainActivity.CAMERA_WIDTH+150, MainActivity.letter3Pos, 
						MainActivity.parrotHeight, MainActivity.parrotHeight);
			} 
			else if(MainActivity.parrotWay == 3)
			{
				Functions.parrotWithLetterPath(4, (float) 0.1,
						1, 3, MainActivity.letter2, MainActivity.parrot, -150, 
						MainActivity.letter2Pos,
						MainActivity.parrotHeight, MainActivity.parrotHeight);
			}
		}
		
		
		else if(a==4)
		{
			
			if(MainActivity.parrotWay == 15)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.uu, MainActivity.MainActivityInstace);
				
				Functions.Jump(MainActivity.letter1, 16);
			}
			else if(MainActivity.parrotWay == 14)
			{
				
				Functions.path(15, MainActivity.parrot, 
						MainActivity.letter5Pos-100, MainActivity.parrotHeight,
						MainActivity.CAMERA_WIDTH+100, MainActivity.parrotHeight,
						MainActivity.CAMERA_WIDTH+100, MainActivity.parrotHeight
						);
			}
		}
	}
}
