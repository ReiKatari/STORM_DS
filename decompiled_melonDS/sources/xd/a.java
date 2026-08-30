package xd;

import android.opengl.GLES20;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f14532a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14533b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14534c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14535d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14536e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14537f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14538g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14539h;

    public a(int i2, int i10, int i11, int i12) {
        this.f14532a = i2;
        this.f14533b = i10;
        this.f14534c = i11;
        this.f14535d = i12;
        GLES20.glUseProgram(i11);
        this.f14536e = GLES20.glGetAttribLocation(i11, "vUV");
        this.f14537f = GLES20.glGetAttribLocation(i11, "vPos");
        this.f14538g = GLES20.glGetAttribLocation(i11, "vAlpha");
        this.f14539h = GLES20.glGetUniformLocation(i11, "tex");
        GLES20.glUseProgram(0);
    }
}
