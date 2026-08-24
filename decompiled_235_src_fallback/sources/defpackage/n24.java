package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n24  reason: default package */
/* loaded from: classes.dex */
public class n24 extends android.graphics.drawable.Drawable.ConstantState {
    public defpackage.me6 a;
    public defpackage.xp6 b;
    public defpackage.ps1 c;
    public android.content.res.ColorStateList d;
    public android.content.res.ColorStateList e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public android.graphics.Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public final android.graphics.Paint.Style q;

    public n24(defpackage.me6 r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r2.e = r0
            r2.f = r0
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.g = r1
            r2.h = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.i = r1
            r2.j = r1
            r1 = 255(0xff, float:3.57E-43)
            r2.l = r1
            r1 = 0
            r2.m = r1
            r2.n = r1
            r1 = 0
            r2.o = r1
            r2.p = r1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.q = r1
            r2.a = r3
            r2.c = r0
            return
    }

    public n24(defpackage.n24 r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r2.e = r0
            r2.f = r0
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.g = r1
            r2.h = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.i = r0
            r2.j = r0
            r0 = 255(0xff, float:3.57E-43)
            r2.l = r0
            r0 = 0
            r2.m = r0
            r2.n = r0
            r0 = 0
            r2.o = r0
            r2.p = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.q = r0
            me6 r0 = r3.a
            r2.a = r0
            xp6 r0 = r3.b
            r2.b = r0
            ps1 r0 = r3.c
            r2.c = r0
            float r0 = r3.k
            r2.k = r0
            android.content.res.ColorStateList r0 = r3.d
            r2.d = r0
            android.content.res.ColorStateList r0 = r3.e
            r2.e = r0
            android.graphics.PorterDuff$Mode r0 = r3.g
            r2.g = r0
            android.content.res.ColorStateList r0 = r3.f
            r2.f = r0
            int r0 = r3.l
            r2.l = r0
            float r0 = r3.i
            r2.i = r0
            int r0 = r3.p
            r2.p = r0
            float r0 = r3.j
            r2.j = r0
            float r0 = r3.m
            r2.m = r0
            float r0 = r3.n
            r2.n = r0
            int r0 = r3.o
            r2.o = r0
            android.graphics.Paint$Style r0 = r3.q
            r2.q = r0
            android.graphics.Rect r0 = r3.h
            if (r0 == 0) goto L75
            android.graphics.Rect r0 = new android.graphics.Rect
            android.graphics.Rect r3 = r3.h
            r0.<init>(r3)
            r2.h = r0
        L75:
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            p24 r0 = new p24
            r0.<init>(r1)
            r1 = 1
            r0.Y = r1
            r0.Z = r1
            return r0
    }
}
