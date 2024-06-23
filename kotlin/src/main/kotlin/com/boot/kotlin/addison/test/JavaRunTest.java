package com.boot.kotlin.addison.test;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaRunTest {

    public static void main(String[] args) {
        long startCurrentMills = System.currentTimeMillis();

        // Long sum = 0L;  // 객테 타입 Long 일 시 소요 시간 7689 mills

        // Primitive 타입을 사용하도록 권장 .... !!
        // 778 millsecond 소요가 됨 불필요한 AutoBoxing 이 일어나지 않아 시간이 감소
        long sum = 0;   // Primitive 타입 사용 시 Auto boxing 이 발생하지 않아 시간이 감소함
        
        for (long i=0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        long endCurrentMills = System.currentTimeMillis();

        System.out.println(sum);
        System.out.println("소요 시간 : " + (endCurrentMills - startCurrentMills));
    }
    
    // @NotNull 어노테이션 사용하여 NotNull 임을 보장
    public @NotNull String testMethod() {

        return null;
    }
}
