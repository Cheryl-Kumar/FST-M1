import pytest
import math

def test_sum_SubString():
    num1 = 5
    num2 = 15
    sum = num1 + num2
    assert sum == 20

def test_sub_SubString():
    num3 = 20
    num4 = 6
    Sub = num3 - num4
    assert Sub == 14

@pytest.mark.markertest
def test_multiply():
    num1 = 3
    num2 = 6
    product = num1*num2
    assert product ==18

@pytest.mark.markertest
def test_divide():
    num1 = 25
    num2 = 5
    Q = num1/num2
    assert Q == 5