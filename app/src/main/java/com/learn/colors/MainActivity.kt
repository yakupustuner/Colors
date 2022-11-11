package com.learn.colors

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.learn.colors.Time.time
import com.learn.colors.Time.time10
import com.learn.colors.Time.time11
import com.learn.colors.Time.time12
import com.learn.colors.Time.time13
import com.learn.colors.Time.time14
import com.learn.colors.Time.time15
import com.learn.colors.Time.time16
import com.learn.colors.Time.time17
import com.learn.colors.Time.time18
import com.learn.colors.Time.time19
import com.learn.colors.Time.time2
import com.learn.colors.Time.time3
import com.learn.colors.Time.time4
import com.learn.colors.Time.time5
import com.learn.colors.Time.time6
import com.learn.colors.Time.time7
import com.learn.colors.Time.time8
import com.learn.colors.Time.time9
import com.learn.colors.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.button.setOnClickListener {
            Handler().postDelayed( {
                binding.button.visibility = View.INVISIBLE
                binding.textView.visibility = View.VISIBLE
            }, time.toLong())
            Handler().postDelayed( {
                binding.textView11.visibility = View.VISIBLE
            }, time2.toLong())
            Handler().postDelayed( {
                binding.textView7.visibility = View.VISIBLE
            }, time3.toLong())
            Handler().postDelayed( {
                binding.textView5.visibility = View.VISIBLE
                ref(binding)
                ref2(binding)
            }, time4.toLong())
            Handler().postDelayed( {
                binding.textView4.visibility = View.VISIBLE
            }, time5.toLong())
            Handler().postDelayed( {
                binding.textView8.visibility = View.VISIBLE
            }, time6.toLong())
            Handler().postDelayed( {
                ref3(binding)
            }, time7.toLong())
            Handler().postDelayed( {
                ref4(binding)
            }, time8.toLong())
            Handler().postDelayed( {
                ref5(binding)
            }, time9.toLong())
            Handler().postDelayed( {
                ref6(binding)
            }, time10.toLong())
            Handler().postDelayed( {
                ref7(binding)
            }, time11.toLong())
            Handler().postDelayed( {
               ref8(binding)
            }, time12.toLong())
            Handler().postDelayed( {
                ref9(binding)
            }, time13.toLong())
            Handler().postDelayed( {
                ref10(binding)
            }, time14.toLong())
            Handler().postDelayed( {
                ref11(binding)
            }, time15.toLong())
            Handler().postDelayed( {
                ref12(binding)
            }, time16.toLong())
            Handler().postDelayed( {
                ref13(binding)
            }, time17.toLong())
            Handler().postDelayed( {
                ref14(binding)
            }, time18.toLong())
            Handler().postDelayed( {
                ref15(binding)
            }, time19.toLong())



        }



        }




}

    private fun ref(binding: ActivityMainBinding) {

        CoroutineScope(Dispatchers.Main).launch {
            withContext(Dispatchers.IO) {
                Thread.sleep(3000)

            }
            binding.button.visibility = View.VISIBLE
            binding.textView.visibility = View.INVISIBLE
            binding.textView11.visibility = View.INVISIBLE
            binding.textView7.visibility = View.INVISIBLE
            binding.textView5.visibility = View.INVISIBLE
            binding.textView4.visibility = View.INVISIBLE
            binding.textView8.visibility = View.INVISIBLE
        }
    }
private fun ref2(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(4000)

        }
        binding.button.visibility = View.INVISIBLE
        binding.textView.visibility = View.VISIBLE
        binding.textView11.visibility = View.VISIBLE
        binding.textView7.visibility = View.VISIBLE
        binding.textView5.visibility = View.VISIBLE
        binding.textView4.visibility = View.VISIBLE
        binding.textView8.visibility = View.VISIBLE
    }

}
private fun ref3(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2000)
        }
        binding.textView3.visibility = View.VISIBLE

}
}
private fun ref4(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2000)
        }
        binding.textView9.visibility = View.VISIBLE

}
}
private fun ref5(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
           Thread.sleep(2000)
        }
        binding.textView2.visibility = View.VISIBLE
    }
}
private fun ref6(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2000)
        }
        binding.textView10.visibility = View.VISIBLE
}
}
private fun ref7(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2300)
        }
        binding.textView13.visibility = View.VISIBLE


}
}
private fun ref8(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2200)
        }
        binding.textView14.visibility = View.VISIBLE
}
}

private fun ref9(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2100)
        }
        binding.textView15.visibility = View.VISIBLE
}
}

private fun ref10(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2000)
        }
        binding.textView16.visibility = View.VISIBLE
}
}

private fun ref11(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(1900)
        }
        binding.textView17.visibility = View.VISIBLE
    }
}

private fun ref12(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(1800)
        }
        binding.textView18.visibility = View.VISIBLE
    }
}

private fun ref13(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2400)
        }
        binding.textView19.visibility = View.VISIBLE
}
}

private fun ref14(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(2700)
        }
        binding.textView20.visibility = View.VISIBLE
        binding.textView21.visibility = View.VISIBLE
        binding.textView22.visibility = View.VISIBLE
        binding.textView23.visibility = View.VISIBLE
        binding.button.visibility = View.VISIBLE
}
}

private fun ref15(binding: ActivityMainBinding) {
    CoroutineScope(Dispatchers.Main).launch {
        withContext(Dispatchers.IO) {
            Thread.sleep(3000)
        }
        binding.textView.visibility = View.INVISIBLE
        binding.textView2.visibility = View.INVISIBLE
        binding.textView3.visibility = View.INVISIBLE
        binding.textView4.visibility = View.INVISIBLE
        binding.textView5.visibility = View.INVISIBLE
        binding.textView7.visibility = View.INVISIBLE
        binding.textView8.visibility = View.INVISIBLE
        binding.textView9.visibility = View.INVISIBLE
        binding.textView10.visibility = View.INVISIBLE
        binding.textView11.visibility = View.INVISIBLE
        binding.textView13.visibility = View.INVISIBLE
        binding.textView14.visibility = View.INVISIBLE
        binding.textView15.visibility = View.INVISIBLE
        binding.textView16.visibility = View.INVISIBLE
        binding.textView17.visibility = View.INVISIBLE
        binding.textView18.visibility = View.INVISIBLE
        binding.textView19.visibility = View.INVISIBLE
        binding.textView20.visibility = View.INVISIBLE
        binding.textView21.visibility = View.INVISIBLE
        binding.textView22.visibility = View.INVISIBLE
        binding.textView23.visibility = View.INVISIBLE


}
}



