package com.example.starting;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.sprite.Sprite;

import com.example.tutorial.Functions;
import com.example.tutorial.Parrot;
import com.example.tutorialgame.TutorialGameLetter;

public class CreateLetterObjects 
{

	public static void createObjects(int a)
	{
		LetterActivity.backGround = new Sprite(0, 0, LetterActivity.mbackGroundTextureRegion, LetterActivity.vertexBufferObjectManager);
		LetterActivity.backGround.setHeight(LetterActivity.CAMERA_HEIGHT);
		LetterActivity.backGround.setWidth(LetterActivity.CAMERA_WIDTH);
		LetterActivity.mScene.attachChild(LetterActivity.backGround);
		
		LetterActivity.parrot = new Parrot(LetterActivity.CAMERA_WIDTH, LetterActivity.parrotHeight, LetterActivity.mParrotTextureRegion, LetterActivity.vertexBufferObjectManager);
		LetterActivity.parrot.animate(new long[]{80, 80, 80, 80, 80, 80}, 0, 5, true);
		LetterActivity.parrot.setFlippedHorizontal(true);
		LetterActivity.mScene.registerTouchArea(LetterActivity.parrot); 
		LetterActivity.mScene.attachChild(LetterActivity.parrot);
		
		if(a==1)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos , 120, 
					LetterActivity.mLetter1TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos, 120,
					LetterActivity.mLetter2TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
//			LetterActivity.letter3 = new TutorialGameLetter(LetterActivity.letter1Pos,
//					230, LetterActivity.mLetter3TextureRegion,
//					LetterActivity.vertexBufferObjectManager); 
//			
//			LetterActivity.letter4 = new TutorialGameLetter(LetterActivity.letter2Pos,
//					230, LetterActivity.mLetter2TextureRegion,
//					LetterActivity.vertexBufferObjectManager); 
//			
//			LetterActivity.Object1 = new Sprite(LetterActivity.letter1Pos + 50, LetterActivity.CAMERA_HEIGHT/2 , LetterActivity.mAamTextureRegion,
//					LetterActivity.vertexBufferObjectManager); 
//			
//			LetterActivity.Object2 = new Sprite(LetterActivity.letter3Pos + 50,LetterActivity.CAMERA_HEIGHT/2 , LetterActivity.mMaTextureRegion,
//					LetterActivity.vertexBufferObjectManager);
		}
		else if(a==2)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos ,
					120, LetterActivity.mLetter3TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos,
					200, LetterActivity.mLetter4TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
//			LetterActivity.letter3 = new TutorialGameLetter(LetterActivity.letter1Pos,
//					290, LetterActivity.mLetter5TextureRegion,
//					LetterActivity.vertexBufferObjectManager); 
//			
//			LetterActivity.letter4 = new TutorialGameLetter(LetterActivity.letter2Pos,
//					290, LetterActivity.mLetter6TextureRegion,
//					LetterActivity.vertexBufferObjectManager); 
//			
//			LetterActivity.Object1 = new Sprite(LetterActivity.letter1Pos + 50, LetterActivity.CAMERA_HEIGHT/2 , LetterActivity.mAamTextureRegion,
//					LetterActivity.vertexBufferObjectManager); 
//			
//			LetterActivity.Object2 = new Sprite(LetterActivity.letter3Pos + 50,LetterActivity.CAMERA_HEIGHT/2 , LetterActivity.mMaTextureRegion,
//					LetterActivity.vertexBufferObjectManager);
		}
		else if(a==3)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos ,
					120, LetterActivity.mLetter5TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos,
					120, LetterActivity.mLetter6TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
		}
		else if(a==4)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos ,
					120, LetterActivity.mLetter7TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos,
					120, LetterActivity.mLetter8TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
		}
		
		//LetterActivity.mScene.registerTouchArea(LetterActivity.letter1);
		LetterActivity.mScene.attachChild(LetterActivity.letter1);
		//LetterActivity.letter1.setVisible(false);
		LetterActivity.letter1.setAlpha(0);
		
		//LetterActivity.mScene.registerTouchArea(LetterActivity.letter2);
		LetterActivity.mScene.attachChild(LetterActivity.letter2);
		//LetterActivity.letter2.setVisible(false);
		LetterActivity.letter2.setAlpha(0);
		
//		LetterActivity.mScene.registerTouchArea(LetterActivity.letter3);
//		LetterActivity.mScene.attachChild(LetterActivity.letter3);
//		
//		LetterActivity.mScene.registerTouchArea(LetterActivity.letter4);
//		LetterActivity.mScene.attachChild(LetterActivity.letter4);
//		
//		//Object1 for showing
//		LetterActivity.mScene.registerTouchArea(LetterActivity.Object1);
//		LetterActivity.Object1.setWidth(130);
//		LetterActivity.Object1.setHeight(130);
//		LetterActivity.mScene.attachChild(LetterActivity.Object1);
//		LetterActivity.Object1.setVisible(false);
//		
//		//Object2 for showing
//		LetterActivity.mScene.registerTouchArea(LetterActivity.Object2);
//		LetterActivity.Object2.setWidth(130);
//		LetterActivity.Object2.setHeight(130);
//		LetterActivity.mScene.attachChild(LetterActivity.Object2);
//		LetterActivity.Object2.setVisible(false);
		
 	}
}
