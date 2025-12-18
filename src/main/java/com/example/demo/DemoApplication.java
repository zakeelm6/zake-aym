package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {


//test
	@GetMapping("/")
	public String home() {
		return "<!doctype html><html><head><meta charset='utf-8'><title>Welcome</title><style>.message{font-family:Arial,sans-serif;font-size:18px;color:#333;}#typing{font-weight:600;color:#155724;margin-left:6px}.progress{width:320px;height:12px;border:1px solid #ddd;border-radius:6px;overflow:hidden;margin-top:12px;background:#f5f5f5}.progress-bar{height:100%;width:0%;background:linear-gradient(90deg,#ffb74d,#ff8a65);transition:width 0.2s linear;border-radius:6px}#status{font-size:13px;color:#666;margin-top:8px}</style></head><body><div class='message'>Zakariya and Ayman — <span id='typing'></span></div><div class='progress' role='progressbar' aria-valuemin='0' aria-valuemax='100'><div id='bar' class='progress-bar'></div></div><div id='status'>Working hard... <span id='percent'>0%</span></div><script>(function(){var txt='Working hard to reach 100%';var i=0;var el=document.getElementById('typing');var bar=document.getElementById('bar');var pctEl=document.getElementById('percent');var pct=0;function typeNext(){if(i<txt.length){el.innerText += txt.charAt(i++);setTimeout(typeNext,70);} }function inc(){if(pct<100){pct+=1;bar.style.width=pct+'%';pctEl.innerText=pct+'%';} else clearInterval(t);}typeNext();var t=setInterval(inc,60);})();</script></body></html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
