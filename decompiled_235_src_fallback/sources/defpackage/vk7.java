package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk7  reason: default package */
/* loaded from: classes.dex */
public final class vk7 extends defpackage.wk7 {
    public final android.graphics.Matrix a;
    public final java.util.ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final android.graphics.Matrix j;
    public java.lang.String k;

    public vk7() {
            r2 = this;
            r2.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.b = r0
            r0 = 0
            r2.c = r0
            r2.d = r0
            r2.e = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.f = r1
            r2.g = r1
            r2.h = r0
            r2.i = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.j = r0
            r0 = 0
            r2.k = r0
            return
    }

    public vk7(defpackage.vk7 r8, defpackage.wu r9) {
            r7 = this;
            r7.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.b = r0
            r0 = 0
            r7.c = r0
            r7.d = r0
            r7.e = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.f = r1
            r7.g = r1
            r7.h = r0
            r7.i = r0
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r7.j = r2
            r3 = 0
            r7.k = r3
            float r4 = r8.c
            r7.c = r4
            float r4 = r8.d
            r7.d = r4
            float r4 = r8.e
            r7.e = r4
            float r4 = r8.f
            r7.f = r4
            float r4 = r8.g
            r7.g = r4
            float r4 = r8.h
            r7.h = r4
            float r4 = r8.i
            r7.i = r4
            java.lang.String r4 = r8.k
            r7.k = r4
            if (r4 == 0) goto L51
            r9.put(r4, r7)
        L51:
            android.graphics.Matrix r4 = r8.j
            r2.set(r4)
            java.util.ArrayList r8 = r8.b
            r2 = 0
        L59:
            int r4 = r8.size()
            if (r2 >= r4) goto Le9
            java.lang.Object r4 = r8.get(r2)
            boolean r5 = r4 instanceof defpackage.vk7
            if (r5 == 0) goto L74
            vk7 r4 = (defpackage.vk7) r4
            java.util.ArrayList r5 = r7.b
            vk7 r6 = new vk7
            r6.<init>(r4, r9)
            r5.add(r6)
            goto Ldf
        L74:
            boolean r5 = r4 instanceof defpackage.uk7
            if (r5 == 0) goto Lc8
            uk7 r5 = new uk7
            uk7 r4 = (defpackage.uk7) r4
            r5.<init>(r4)
            r5.e = r0
            r5.g = r1
            r5.h = r1
            r5.i = r0
            r5.j = r1
            r5.k = r0
            android.graphics.Paint$Cap r6 = android.graphics.Paint.Cap.BUTT
            r5.l = r6
            android.graphics.Paint$Join r6 = android.graphics.Paint.Join.MITER
            r5.m = r6
            r6 = 1082130432(0x40800000, float:4.0)
            r5.n = r6
            ei r6 = r4.d
            r5.d = r6
            float r6 = r4.e
            r5.e = r6
            float r6 = r4.g
            r5.g = r6
            ei r6 = r4.f
            r5.f = r6
            int r6 = r4.c
            r5.c = r6
            float r6 = r4.h
            r5.h = r6
            float r6 = r4.i
            r5.i = r6
            float r6 = r4.j
            r5.j = r6
            float r6 = r4.k
            r5.k = r6
            android.graphics.Paint$Cap r6 = r4.l
            r5.l = r6
            android.graphics.Paint$Join r6 = r4.m
            r5.m = r6
            float r4 = r4.n
            r5.n = r4
            goto Ld3
        Lc8:
            boolean r5 = r4 instanceof defpackage.tk7
            if (r5 == 0) goto Le3
            tk7 r5 = new tk7
            tk7 r4 = (defpackage.tk7) r4
            r5.<init>(r4)
        Ld3:
            java.util.ArrayList r4 = r7.b
            r4.add(r5)
            java.lang.String r4 = r5.b
            if (r4 == 0) goto Ldf
            r9.put(r4, r5)
        Ldf:
            int r2 = r2 + 1
            goto L59
        Le3:
            java.lang.String r7 = "Unknown object in the tree!"
            defpackage.i.m(r7)
            throw r3
        Le9:
            return
    }

    @Override // defpackage.wk7
    public final boolean a() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList r2 = r4.b
            int r3 = r2.size()
            if (r1 >= r3) goto L1b
            java.lang.Object r2 = r2.get(r1)
            wk7 r2 = (defpackage.wk7) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L18
            r4 = 1
            return r4
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            return r0
    }

    @Override // defpackage.wk7
    public final boolean b(int[] r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList r2 = r4.b
            int r3 = r2.size()
            if (r0 >= r3) goto L18
            java.lang.Object r2 = r2.get(r0)
            wk7 r2 = (defpackage.wk7) r2
            boolean r2 = r2.b(r5)
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L2
        L18:
            return r1
    }

    public final void c() {
            r3 = this;
            android.graphics.Matrix r0 = r3.j
            r0.reset()
            float r1 = r3.d
            float r1 = -r1
            float r2 = r3.e
            float r2 = -r2
            r0.postTranslate(r1, r2)
            float r1 = r3.f
            float r2 = r3.g
            r0.postScale(r1, r2)
            float r1 = r3.c
            r2 = 0
            r0.postRotate(r1, r2, r2)
            float r1 = r3.h
            float r2 = r3.d
            float r1 = r1 + r2
            float r2 = r3.i
            float r3 = r3.e
            float r2 = r2 + r3
            r0.postTranslate(r1, r2)
            return
    }

    public java.lang.String getGroupName() {
            r0 = this;
            java.lang.String r0 = r0.k
            return r0
    }

    public android.graphics.Matrix getLocalMatrix() {
            r0 = this;
            android.graphics.Matrix r0 = r0.j
            return r0
    }

    public float getPivotX() {
            r0 = this;
            float r0 = r0.d
            return r0
    }

    public float getPivotY() {
            r0 = this;
            float r0 = r0.e
            return r0
    }

    public float getRotation() {
            r0 = this;
            float r0 = r0.c
            return r0
    }

    public float getScaleX() {
            r0 = this;
            float r0 = r0.f
            return r0
    }

    public float getScaleY() {
            r0 = this;
            float r0 = r0.g
            return r0
    }

    public float getTranslateX() {
            r0 = this;
            float r0 = r0.h
            return r0
    }

    public float getTranslateY() {
            r0 = this;
            float r0 = r0.i
            return r0
    }

    public void setPivotX(float r2) {
            r1 = this;
            float r0 = r1.d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.d = r2
            r1.c()
        Lb:
            return
    }

    public void setPivotY(float r2) {
            r1 = this;
            float r0 = r1.e
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.e = r2
            r1.c()
        Lb:
            return
    }

    public void setRotation(float r2) {
            r1 = this;
            float r0 = r1.c
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.c = r2
            r1.c()
        Lb:
            return
    }

    public void setScaleX(float r2) {
            r1 = this;
            float r0 = r1.f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f = r2
            r1.c()
        Lb:
            return
    }

    public void setScaleY(float r2) {
            r1 = this;
            float r0 = r1.g
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.g = r2
            r1.c()
        Lb:
            return
    }

    public void setTranslateX(float r2) {
            r1 = this;
            float r0 = r1.h
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.h = r2
            r1.c()
        Lb:
            return
    }

    public void setTranslateY(float r2) {
            r1 = this;
            float r0 = r1.i
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.i = r2
            r1.c()
        Lb:
            return
    }
}
