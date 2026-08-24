package defpackage;

import android.opengl.GLES20;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd6  reason: default package */
/* loaded from: classes.dex */
public final class wd6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public wd6(int i, int i2, int i3, int i4) {
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
