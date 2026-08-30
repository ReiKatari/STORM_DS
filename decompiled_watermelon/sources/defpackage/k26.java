package defpackage;

import android.opengl.GLES20;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k26  reason: default package */
/* loaded from: classes.dex */
public final class k26 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public k26(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        GLES20.glUseProgram(i3);
        this.e = GLES20.glGetAttribLocation(i3, "vUV");
        this.f = GLES20.glGetAttribLocation(i3, "vPos");
        this.g = GLES20.glGetAttribLocation(i3, "vAlpha");
        this.h = GLES20.glGetUniformLocation(i3, "tex");
        GLES20.glUseProgram(0);
    }
}
