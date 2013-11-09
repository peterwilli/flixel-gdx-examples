package org.flixel.examples.userinterface;

import org.flixel.FlxCamera;
import org.flixel.FlxGame;

/**
 *
 * @author Ka Wing Chin
 */
public class UserInterfaceDemo extends FlxGame
{
	public UserInterfaceDemo()
	{
		super(320, 480, Test.class, 1, 50, 50, false, FlxCamera.FILL_Y);
		forceDebugger = true;
	}
}
