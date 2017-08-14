/**
 * Copyright (C) 2014 Open Whisper Systems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ca.kousu.iff;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Context;
import android.util.Log;

public class MainActivity extends Activity {

  private static final String TAG = MainActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Context context = getApplicationContext();
    CharSequence text = "IF you can keep your head when all about you\n"
     + "Are losing theirs and blaming it on you,\n"
     + "If you can trust yourself when all men doubt you,\n"
     + "But make allowance for their doubting too;\n"
     + "If you can wait and not be tired by waiting,\n"
     + "Or being lied about, don't deal in lies,\n"
     + "Or being hated, don't give way to hating,\n"
     + "And yet don't look too good, nor talk too wise:\n"
     + "\n"
     + "If you can dream - and not make dreams your master;\n"
     + "If you can think - and not make thoughts your aim;\n"
     + "If you can meet with Triumph and Disaster\n"
     + "And treat those two impostors just the same;\n"
     + "If you can bear to hear the truth you've spoken\n"
     + "Twisted by knaves to make a trap for fools,\n"
     + "Or watch the things you gave your life to, broken,\n"
     + "And stoop and build 'em up with worn-out tools:\n"
     + "\n"
     + "If you can make one heap of all your winnings\n"
     + "And risk it on one turn of pitch-and-toss,\n"
     + "And lose, and start again at your beginnings\n"
     + "And never breathe a word about your loss;\n"
     + "If you can force your heart and nerve and sinew\n"
     + "To serve your turn long after they are gone,\n"
     + "And so hold on when there is nothing in you\n"
     + "Except the Will which says to them: 'Hold on!'\n"
     + "\n"
     + "If you can talk with crowds and keep your virtue,\n"
     + "' Or walk with Kings - nor lose the common touch,\n"
     + "if neither foes nor loving friends can hurt you,\n"
     + "If all men count with you, but none too much;\n"
     + "If you can fill the unforgiving minute\n"
     + "With sixty seconds' worth of distance run,\n"
     + "Yours is the Earth and everything that's in it,\n"
     + "And - which is more - you'll be a Man, my son!\n";

    Log.i(TAG, text.toString());
    Toast.makeText(context, text, Toast.LENGTH_LONG).show();
  }
}
