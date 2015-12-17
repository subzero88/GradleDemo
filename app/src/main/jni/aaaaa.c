//
// Created by subzero on 15/12/10.
//

#include "com_subzero_demo_MainActivity.h"
#include <jni.h>

JNIEXPORT jstring JNICALL Java_com_subzero_demo_MainActivity_getString
        (JNIEnv * env, jobject obj){
    return (*(*env)).NewStringUTF(env,"Hello jni!");
}