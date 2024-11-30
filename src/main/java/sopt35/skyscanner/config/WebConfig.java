package sopt35.skyscanner.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Spring 서버 전역적으로 CORS 설정
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 특정 도메인에서만 CORS 요청을 허용
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173", "https://35-collaboration-web-skyscanner.vercel.app") // 허용할 출처 : 특정 도메인만 받을 수 있음
                .allowedMethods("GET", "POST", "PATCH") // 허용할 HTTP method
                .allowedHeaders("Content-Type", "Authorization", "X-Requested-With") // 클라이언트가 보낼 수 있는 헤더들
                .exposedHeaders("Authorization") // 클라이언트가 응답 헤더에서 읽을 수 있는 헤더들
                .allowCredentials(true) // 쿠키 인증 요청 허용
                .maxAge(3600); // Preflight 요청 캐시 시간 설정 (1시간)
    }
}
