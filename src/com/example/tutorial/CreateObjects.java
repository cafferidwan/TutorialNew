package com.example.tutorial;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;

import com.example.tutorialgame.TutorialGameActivity;

import android.content.Intent;
import android.sax.StartElementListener;

public class CreateObjects 
{

	public static void createObject(int a)
	{
		MainActivity.backGround = new Sprite(0, 0, MainActivity.mbackGroundTextureRegion, MainActivity.vertexBufferObjectManager);
		MainActivity.backGround.setHeight(MainActivity.CAMERA_HEIGHT);
		MainActivity.backGround.setWidth(MainActivity.CAMERA_WIDTH);
		MainActivity.mScene.attachChild(MainActivity.backGround);
		
		MainActivity.parrot = new Parrot(MainActivity.CAMERA_WIDTH, MainActivity.parrotHeight, MainActivity.mParrotTextureRegion, MainActivity.vertexBufferObjectManager);
		MainActivity.parrot.animate(new long[]{80, 80, 80, 80, 80, 80}, 0, 5, true);
		MainActivity.parrot.setFlippedHorizontal(true);
		MainActivity.mScene.registerTouchArea(MainActivity.parrot); 
		MainActivity.mScene.attachChild(MainActivity.parrot);
		
		if(a==1)
		{
			MainActivity.letter1 = new Letter(MainActivity.CAMERA_WIDTH , MainActivity.parrotHeight, MainActivity.mLetter1TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter2 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter2TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter3 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter2TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter4 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter3TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.Object1 = new Letter(MainActivity.letter1Pos , 60, MainActivity.mObject1TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.Object2 = new Letter(MainActivity.letter3Pos , 60, MainActivity.mObject2TextureRegion,
					MainActivity.vertexBufferObjectManager);
		}
		else if(a==2)
		{
			MainActivity.letter1 = new Letter(MainActivity.CAMERA_WIDTH , MainActivity.parrotHeight, MainActivity.mLetter4TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter2 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter6TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter3 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter5TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter4 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter7TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter5 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter8TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			MainActivity.mScene.registerTouchArea(MainActivity.letter5);
			MainActivity.mScene.attachChild(MainActivity.letter5);
			
			MainActivity.Object1 = new Letter(MainActivity.letter1Pos , 60, MainActivity.mObject3TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.Object2 = new Letter(MainActivity.letter3Pos , 60, MainActivity.mObject7TextureRegion,
					MainActivity.vertexBufferObjectManager);
		}
		else if(a==3)
		{
			MainActivity.letter1 = new Letter(MainActivity.CAMERA_WIDTH , MainActivity.parrotHeight, MainActivity.mLetter14TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter2 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter9TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter3 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter15TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter4 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter10TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter5 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter14TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			MainActivity.mScene.registerTouchArea(MainActivity.letter5);
			MainActivity.mScene.attachChild(MainActivity.letter5);
			
			
			MainActivity.Object1 = new Letter(MainActivity.letter1Pos , 60, MainActivity.mObject4TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.Object2 = new Letter(MainActivity.letter3Pos , 60, MainActivity.mObject6TextureRegion,
					MainActivity.vertexBufferObjectManager);
		}
		else if(a==4)
		{
			MainActivity.letter1 = new Letter(MainActivity.CAMERA_WIDTH , MainActivity.parrotHeight, MainActivity.mLetter11TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter2 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter13TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter3 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter12TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter4 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter14TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.letter5 = new Letter(MainActivity.CAMERA_WIDTH +100,MainActivity.CAMERA_HEIGHT / 18, MainActivity.mLetter8TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			MainActivity.mScene.registerTouchArea(MainActivity.letter5);
			MainActivity.mScene.attachChild(MainActivity.letter5);
			
			MainActivity.Object1 = new Letter(MainActivity.letter1Pos , 60, MainActivity.mObject8TextureRegion,
					MainActivity.vertexBufferObjectManager); 
			
			MainActivity.Object2 = new Letter(MainActivity.letter3Pos , 60, MainActivity.mObject5TextureRegion,
					MainActivity.vertexBufferObjectManager);
		}
		
		MainActivity.mScene.registerTouchArea(MainActivity.letter1);
		MainActivity.mScene.attachChild(MainActivity.letter1);
		
		MainActivity.mScene.registerTouchArea(MainActivity.letter2);
		MainActivity.mScene.attachChild(MainActivity.letter2);
		
		MainActivity.mScene.registerTouchArea(MainActivity.letter3);
		MainActivity.mScene.attachChild(MainActivity.letter3);
		
		MainActivity.mScene.registerTouchArea(MainActivity.letter4);
		MainActivity.mScene.attachChild(MainActivity.letter4);
		
		//Object1 for showing
		MainActivity.mScene.registerTouchArea(MainActivity.Object1);
//		MainActivity.Object1.setWidth(130);
//		MainActivity.Object1.setHeight(130);
		MainActivity.mScene.attachChild(MainActivity.Object1);
		MainActivity.Object1.setVisible(false);
		
		//Object2 for showing
		MainActivity.mScene.registerTouchArea(MainActivity.Object2);
//		MainActivity.Object2.setWidth(130);
//		MainActivity.Object2.setHeight(130);
		MainActivity.mScene.attachChild(MainActivity.Object2);
		MainActivity.Object2.setVisible(false);
		
		MainActivity.nextButton = new Letter(MainActivity.CAMERA_WIDTH/2-40 , MainActivity.CAMERA_HEIGHT/2-80, MainActivity.mNextButtonTextureRegion,
				MainActivity.vertexBufferObjectManager)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:
						
					if(MainActivity.nextButton.isVisible() == true)
					{
						MainActivity.MainActivityInstace.finish();
						MainActivity.MainActivityInstace.startActivity(
								new Intent(MainActivity.MainActivityInstace, TutorialGameActivity.class));
						
					}
						 
					break;
				}

				return true;
			}
		}; 
		
		MainActivity.mScene.registerTouchArea(MainActivity.nextButton);
		MainActivity.nextButton.setWidth(130);
		MainActivity.nextButton.setHeight(130);
		MainActivity.mScene.attachChild(MainActivity.nextButton);
		MainActivity.nextButton.setVisible(false);
	}
	
}
