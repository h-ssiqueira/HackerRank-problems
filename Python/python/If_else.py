#!/bin/python3

from abc import abstractmethod
import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    if n % 2 != 0 or n >= 6 and n <= 20:
        print("Weird")
    else:
        print("Not Weird")