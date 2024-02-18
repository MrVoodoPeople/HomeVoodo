#include "pch.h"
#include "../StaticLib1/framework.h"


TEST(TestCaseName, TestName) {
  EXPECT_EQ(1, 1);
  EXPECT_TRUE(isPrime(11));
  EXPECT_EQ(isPrime(12), isPrime(12));
}