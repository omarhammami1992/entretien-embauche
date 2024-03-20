package com.neosoft.test2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCheckerTest {
    @Test
    void test0() {
        final boolean check = StringChecker.check("aa(bb)cc");

        assertThat(check).isTrue();
    }

    @Test
    void test1() {
        final boolean check = StringChecker.check("aa)bb(cc");

        assertThat(check).isFalse();
    }

    @Test
    void test2() {
        final boolean check = StringChecker.check("aa((bb(cc");

        assertThat(check).isFalse();
    }
    @Test
    void test3() {
        final boolean check = StringChecker.check("aa(bb))()cc");

        assertThat(check).isFalse();
    }
    @Test
    void test5() {
        final boolean check = StringChecker.check("aa[]bbcc");

        assertThat(check).isTrue();
    }
    @Test
    void test6() {
        final boolean check = StringChecker.check("aa[()[]]bbcc");

        assertThat(check).isTrue();
    }
    @Test
    void test7() {
        final boolean check = StringChecker.check("");

        assertThat(check).isTrue();
    }
}