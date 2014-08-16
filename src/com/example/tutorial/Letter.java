package com.example.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.JumpModifier;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import com.example.starting.LetterActivity;


public class Letter extends Sprite 
{

	public static int counter;
	
	public Letter(float pX, float pY, 
			ITextureRegion pTextureRegion, VertexBufferObjectManager VertexBufferObject) 
	{
		super(pX, pY, pTextureRegion, VertexBufferObject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
			final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
	{
		switch (pSceneTouchEvent.getAction()) 
		{
		case TouchEvent.ACTION_DOWN:

//			this.setScale((float) 1.2);
//			Functions.audioPlay = true;
//			Functions.playAudio(R.raw.mo);
			
			if(!SoundFunction.mediaPlayer.isPlaying() && !SoundFunction.mediaPlayer.isPlaying() 
					&& !SoundFunction.mediaPlayer.isPlaying())
			{
				letterSound(this); 
				
//				counter++;
//				if(counter==1)
//				{
//					Jump(this);
//				}
			}

			break;
		}

		return true;
	}
	
	public static void Jump(final Sprite sprite)
	{
		if(sprite!= null)
		{
		JumpModifier yourModifier = new JumpModifier((float)0.3, sprite.getX(), sprite.getX(), sprite.getY()-50, sprite.getY(), 2)
		{
		        @Override
		        protected void onModifierStarted(IEntity pItem)
		        {
		                super.onModifierStarted(pItem);
		                // Your action after starting modifier
		               // sprite.setScale((float) 1.5);
		        }
		        @Override
		        protected void onModifierFinished(IEntity pItem)
		        {
		                super.onModifierFinished(pItem);
		                // Your action after finishing modifier
		                sprite.setScale((float) 1.0);
		                //sprite.setAlpha(1);
		                counter=0;
			     }
		};
		 
		sprite.registerEntityModifier(yourModifier);
		}
	}
	
	
	public void letterSound(Sprite a)
	{
		if(LetterActivity.letterNumber == 1)
		{
			//shorea
			if(a == MainActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.aa, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.mo, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.mo, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.aa, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.aam, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.ma, MainActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				Jump(this);
			}
		}
		//u
		else if(LetterActivity.letterNumber == 2)
		{
			if(a == MainActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.uu, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.to, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.chu, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.chu, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter5)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.lo, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.ut, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.chul, MainActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				if(a == MainActivity.letter3 )
				{
					Jump(a);
					Jump(MainActivity.letter4);
				}
				else if(a == MainActivity.letter4 )
				{
					Jump(a);
					Jump(MainActivity.letter3);
				}
				else
				{
					Jump(this);
				}
			}
		}
		else if(LetterActivity.letterNumber == 3)
		{
			if(a == MainActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.bo, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.ii, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.cha, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.bi, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter5)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.bi, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.boi, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.chabi, MainActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				if(a == MainActivity.letter4)
				{
					Jump(a);
					Jump(MainActivity.letter5);
				}
				else if(a == MainActivity.letter5)
				{
					Jump(a);
					Jump(MainActivity.letter4);
				}
				else
				{
					Jump(this);
				}
			}
		}
		else if(LetterActivity.letterNumber == 4)
		{
			if(a == MainActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.e, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.ko, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.be, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.be, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.letter5)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.lo, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.ek, MainActivity.MainActivityInstace);
			}
			else if(a == MainActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.bel, MainActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				if(a == MainActivity.letter3 )
				{
					Jump(a);
					Jump(MainActivity.letter4);
				}
				else if(a == MainActivity.letter4 )
				{
					Jump(a);
					Jump(MainActivity.letter3);
				}
				else
				{
					Jump(this);
				}
			}
		}
	}
};
