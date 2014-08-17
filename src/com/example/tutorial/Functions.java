package com.example.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.modifier.DelayModifier;
import org.andengine.entity.modifier.JumpModifier;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.ScaleModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.modifier.IEntityModifier.IEntityModifierListener;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.modifier.IModifier;
import org.andengine.util.modifier.ease.EaseSineInOut;

import com.example.starting.LetterActivity;


public class Functions 
{

	static void parrotWithLetterPath(final int number, float delay, int flip, float time, Sprite sprite, 
			Sprite sprite1, float x1, final float x2, float y1, float y2) 
	{
		if(flip == 0)
		{
			sprite1.setFlippedHorizontal(false);
		}
		else if(flip == 1)
		{
			sprite1.setFlippedHorizontal(true);
		}
		
		MoveModifier mModParrot = new MoveModifier(time, x1, x2, y1, y2);
		MoveModifier mModLetter = new MoveModifier(time, x1 +50, x2 +50, y1 +170, y2 +170);
		
		DelayModifier dMod = new DelayModifier((float) delay,new IEntityModifierListener()
		{

					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1) 
					{
					
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{
						MainActivity.parrotWay = number;
						
						if(LetterActivity.letterNumber == 1)
						{
							AAnimation.startAAnimation(1);
						}
						else if(LetterActivity.letterNumber == 2)
						{
							UAnimation.startUAnimation(1);
						}
						else if(LetterActivity.letterNumber == 3)
						{
							EAnimation.startEAnimation(1);
						}
						else if(LetterActivity.letterNumber == 4)
						{
							AakarAnimation.startAakarAnimation(1);
						}
						
					}
				});
		
		SequenceEntityModifier parrot_sm = new SequenceEntityModifier(mModParrot,dMod);
		SequenceEntityModifier mLetter_sm = new SequenceEntityModifier(mModLetter,dMod);
		
		sprite1.registerEntityModifier(parrot_sm);
		sprite.registerEntityModifier(mLetter_sm);
	}
	
	static void letter(final int number, float time,final Sprite sprite, float x1, float x2, float y1, float y2)
	{
		MoveModifier mModLetter1 = new MoveModifier(time, x1, x2, y1, y2);
		DelayModifier dMod1 = new DelayModifier((float) time,new IEntityModifierListener()
		{
					@Override
					public void onModifierStarted(IModifier<IEntity> arg0, IEntity arg1) 
					{
					
					}
					@Override
					public void onModifierFinished(IModifier<IEntity> arg0, IEntity arg1)
					{
						MainActivity.parrotWay = number;
						
						if(LetterActivity.letterNumber == 1)
						{
							AAnimation.startAAnimation(2);
						}
						else if(LetterActivity.letterNumber == 2)
						{
							UAnimation.startUAnimation(2);
							UAnimation.startUAnimation(4);
						}
						else if(LetterActivity.letterNumber == 3)
						{
							EAnimation.startEAnimation(2);
							EAnimation.startEAnimation(4);
						}
						else if(LetterActivity.letterNumber == 4)
						{
							AakarAnimation.startAakarAnimation(2);
							AakarAnimation.startAakarAnimation(4);
						}
					}
				});  
		
		SequenceEntityModifier mLetter_sm = new SequenceEntityModifier(mModLetter1,dMod1);
		sprite.registerEntityModifier(mLetter_sm);
	}
	
	
	public static void parrotPath(final int number, float delay, float time, Sprite sprite, float x1, float x2, float y1, float y2)
	{
		MoveModifier mModParrot1 = new MoveModifier(time, x1, x2, y1, y2);
		DelayModifier dMod1 = new DelayModifier((float) delay , new IEntityModifierListener()
		{
					@Override
					public void onModifierStarted(IModifier<IEntity> arg0, IEntity arg1) 
					{

					}
					@Override
					public void onModifierFinished(IModifier<IEntity> arg0, IEntity arg1)
					{
						MainActivity.parrotWay = number; 
						
						if(LetterActivity.letterNumber == 1)
						{
							AAnimation.startAAnimation(3);
						}
						else if(LetterActivity.letterNumber == 2)
						{
							UAnimation.startUAnimation(3);
						}
						else if(LetterActivity.letterNumber == 3)
						{
							EAnimation.startEAnimation(3);
							EAnimation.startEAnimation(4);
						}
						else if(LetterActivity.letterNumber == 4)
						{
							AakarAnimation.startAakarAnimation(3);
						}
					}
				});
		
		SequenceEntityModifier mLetter_sm1 = new SequenceEntityModifier(mModParrot1,dMod1);
		sprite.registerEntityModifier(mLetter_sm1);
	}
	
	public static void path(final int number, Sprite sprite, float x1, float y1, float x2, float y2, float x3, float y3)
	{
		final Path path = new Path(3).to(x1, y1).to(x2, y2)
				.to(x3, y3); 
		sprite.registerEntityModifier(new PathModifier((float) 4.1, path, null, new IPathModifierListener() 
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{

			}
			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{
				
			}
			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{

			}
			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity)
			{
				MainActivity.parrotWay = number; 
				
				if(LetterActivity.letterNumber == 1)
				{
					AAnimation.startAAnimation(4);
				}
				else if(LetterActivity.letterNumber == 2)
				{
					UAnimation.startUAnimation(4);
				}
				else if(LetterActivity.letterNumber == 3)
				{
					EAnimation.startEAnimation(4);
					EAnimation.startEAnimation(3);
				}
				else if(LetterActivity.letterNumber == 4)
				{
					AakarAnimation.startAakarAnimation(4);
				}
				
			}
		}, EaseSineInOut.getInstance()));
	}
	
	public static void fadeOut(final Sprite sprite)
	{
		if(sprite!= null)
		{
		ScaleModifier yourModifier = new ScaleModifier(1f, 1.5f, 2f)
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
		        }
		};
		 
		sprite.registerEntityModifier(yourModifier);
		}
	}
	
	
	public static void fadeIn(final Sprite sprite)
	{
		if(sprite!= null)
		{
		AlphaModifier yourModifier = new AlphaModifier(1, (float) 0.3, 1)
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
		        }
		};
		 
		sprite.registerEntityModifier(yourModifier);
		}
	}
	
	
	public static void Jump(final Sprite sprite, final int number)
	{
		if(sprite!= null)
		{
		JumpModifier yourModifier = new JumpModifier((float)0.5, sprite.getX(), sprite.getX(), sprite.getY()-50, sprite.getY(), 2)
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
		                
		                MainActivity.parrotWay = number; 
		                
		                if(LetterActivity.letterNumber == 1)
		                {
		                	if(MainActivity.parrotWay== 13)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_mo, MainActivity.MainActivityInstace);
			    						
		                				Functions.Jump(MainActivity.letter2, 14);
			    					} 
			    				}));
		                		
		                		
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_aam, MainActivity.MainActivityInstace);
			    						
		                				MainActivity.Object1.setVisible(true);
				                		fadeIn(MainActivity.Object1);
			    					} 
			    				}));
		                	}
		                	else if(MainActivity.parrotWay== 14)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_mo, MainActivity.MainActivityInstace);
			    						
		                				Functions.Jump(MainActivity.letter3, 15);
			    					} 
			    				}));
			                	
			                }
			                else if(MainActivity.parrotWay== 15)
			                {
			                	MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_aa, MainActivity.MainActivityInstace);
			    						
					                	Functions.Jump(MainActivity.letter4, 16);
			    					} 
			    				}));
			                	
			                	MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                			  	SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_ma, MainActivity.MainActivityInstace);
					                	
					                	MainActivity.Object2.setVisible(true);
					                	fadeIn(MainActivity.Object2);
			    					} 
			    				}));
			              
			                }
			                else if(MainActivity.parrotWay== 16)
			                {
			            		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				MainActivity.nextButton.setVisible(true);
					                	fadeIn(MainActivity.nextButton);
		    						} 
			    				}));
			                }
		                }
		                
		                
		                
		                else if(LetterActivity.letterNumber == 2)
		                {
		                	if(MainActivity.parrotWay == 16)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_to, MainActivity.MainActivityInstace);
			    						
			    						Functions.Jump(MainActivity.letter2, 17);
			    					} 
			    				}));
		                	}
		                	else if(MainActivity.parrotWay == 17)
		                	{
		                		
		                 		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_ut, MainActivity.MainActivityInstace);
			    						
			    						MainActivity.Object1.setVisible(true);
					                	fadeIn(MainActivity.Object1);
			    					} 
			    				}));
		                
			                	
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
			    						SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_chu, MainActivity.MainActivityInstace);
		                				
			    						Functions.Jump(MainActivity.letter3, 18);
		                				Functions.Jump(MainActivity.letter4, 18);
			    					} 
			    				}));
		                	}
		                	else if(MainActivity.parrotWay == 18)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
			    						SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_lo, MainActivity.MainActivityInstace);
		                				
			    						Functions.Jump(MainActivity.letter5, 19);
			    					} 
			    				}));
		                		
		                		
		                 		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
			    						SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_chul, MainActivity.MainActivityInstace);
		                				
			    						MainActivity.Object2.setVisible(true);
					                	fadeIn(MainActivity.Object2);
			    					} 
			    				}));
		                	}
		                	else if(MainActivity.parrotWay == 19)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				MainActivity.nextButton.setVisible(true);
					                	fadeIn(MainActivity.nextButton);
		    						} 
			    				}));
		                	
		                	}
		                }
		                
		                
		                
		                else if(LetterActivity.letterNumber == 3)
		                {
		                	if(MainActivity.parrotWay == 19)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				Functions.Jump(MainActivity.letter2, 20);
				                		
				                		SoundFunction.audioPlay = true; 
										SoundFunction.playAudio(R.raw.tgame_ii, MainActivity.MainActivityInstace);
		    						} 
			    				}));
		                		
		                	}
		                	else if(MainActivity.parrotWay == 20)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1.5, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				MainActivity.Object1.setVisible(true);
					                	fadeIn(MainActivity.Object1);
					                	
					                	SoundFunction.audioPlay = true; 
		        						SoundFunction.playAudio(R.raw.tgame_boi, MainActivity.MainActivityInstace);
			    					} 
			    				}));
		                		
			                	
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 3, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				Functions.Jump(MainActivity.letter3, 21);
		                				
		                				SoundFunction.audioPlay = true; 
		        						SoundFunction.playAudio(R.raw.tgame_cha, MainActivity.MainActivityInstace);
			    					} 
			    				}));
		                	}
		                	else if(MainActivity.parrotWay == 21)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true; 
										SoundFunction.playAudio(R.raw.tgame_bi, MainActivity.MainActivityInstace);
										
										Functions.Jump(MainActivity.letter4, 22);
		                				Functions.Jump(MainActivity.letter5, 22);
		    						} 
			    				}));
		                		
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true; 
										SoundFunction.playAudio(R.raw.tgame_chabi, MainActivity.MainActivityInstace);
										
										MainActivity.Object2.setVisible(true);
					                	fadeIn(MainActivity.Object2);
		    						} 
			    				}));
		                		
		                	}
		                	else if(MainActivity.parrotWay == 22)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				MainActivity.nextButton.setVisible(true);
					                	fadeIn(MainActivity.nextButton);
		    						} 
			    				}));
		                	
		                	}
		                }
		                
		                
		                else if(LetterActivity.letterNumber == 4)
		                {
		                	if(MainActivity.parrotWay == 16)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1.85, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
			    						SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_ko, MainActivity.MainActivityInstace);
			    						
			    						Functions.Jump(MainActivity.letter2, 17);
			    					} 
			    				}));
		                	}
		                	else if(MainActivity.parrotWay == 17)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_ek, MainActivity.MainActivityInstace);
			    						
			    						MainActivity.Object1.setVisible(true);
					                	fadeIn(MainActivity.Object1);
			    					} 
			    				}));
		                		
			                	
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_be, MainActivity.MainActivityInstace);
			    						
		                				Functions.Jump(MainActivity.letter3, 18);
		                				Functions.Jump(MainActivity.letter4, 18);
			    					} 
			    				}));
		                	}
		                	else if(MainActivity.parrotWay == 18)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_lo, MainActivity.MainActivityInstace);
			    						
			    						Functions.Jump(MainActivity.letter5, 19);
			    					} 
			    				}));
		                		
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 4, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				SoundFunction.audioPlay = true;
			    						SoundFunction.playAudio(R.raw.tgame_bel, MainActivity.MainActivityInstace);
			    						
			    						MainActivity.Object2.setVisible(true);
					                	fadeIn(MainActivity.Object2);
		    						} 
			    				}));
		                		
		                	}
		                	else if(MainActivity.parrotWay == 19)
		                	{
		                		MainActivity.mScene.registerUpdateHandler(new TimerHandler((float) 2, new ITimerCallback() 
		                		{
		                			@Override
		                			public void onTimePassed(TimerHandler pTimerHandler) 
		    						{
		                				// TODO Auto-generated method stub
		                				MainActivity.nextButton.setVisible(true);
					                	fadeIn(MainActivity.nextButton);
		    						} 
			    				}));
		                	
		                	}
		                }
			        }
		};
		 
		sprite.registerEntityModifier(yourModifier);
		}
	}
	
}
