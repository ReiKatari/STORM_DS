package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax2  reason: default package */
/* loaded from: classes.dex */
public final class ax2 extends defpackage.u {
    public final /* synthetic */ int a;
    public final defpackage.a50 b;
    public final java.io.Serializable c;

    public ax2() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            i43 r0 = new i43
            r0.<init>()
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            return
    }

    public ax2(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            zw2 r0 = new zw2
            r0.<init>()
            r1.b = r0
            r0.g = r2
            r1.c = r3
            return
    }

    @Override // defpackage.u
    public void a(java.lang.CharSequence r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.io.Serializable r1 = r1.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r2)
            return
    }

    @Override // defpackage.u
    public void c() {
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.io.Serializable r0 = r9.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L10:
            r2 = 0
            if (r1 < 0) goto L36
            java.lang.Object r3 = r0.get(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r4 = r3.length()
            r5 = r2
        L1e:
            r6 = -1
            if (r5 >= r4) goto L30
            char r7 = r3.charAt(r5)
            r8 = 32
            if (r7 == r8) goto L2d
            switch(r7) {
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L2d;
                case 12: goto L2d;
                case 13: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L31
        L2d:
            int r5 = r5 + 1
            goto L1e
        L30:
            r5 = r6
        L31:
            if (r5 != r6) goto L36
            int r1 = r1 + (-1)
            goto L10
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L3b:
            int r4 = r1 + 1
            if (r2 >= r4) goto L50
            java.lang.Object r4 = r0.get(r2)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.append(r4)
            r4 = 10
            r3.append(r4)
            int r2 = r2 + 1
            goto L3b
        L50:
            java.lang.String r0 = r3.toString()
            a50 r9 = r9.b
            i43 r9 = (defpackage.i43) r9
            r9.g = r0
            return
    }

    @Override // defpackage.u
    public final defpackage.a50 d() {
            r1 = this;
            int r0 = r1.a
            a50 r1 = r1.b
            switch(r0) {
                case 0: goto La;
                default: goto L7;
            }
        L7:
            i43 r1 = (defpackage.i43) r1
            return r1
        La:
            zw2 r1 = (defpackage.zw2) r1
            return r1
    }

    @Override // defpackage.u
    public void f(defpackage.v53 r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.io.Serializable r0 = r1.c
            java.lang.String r0 = (java.lang.String) r0
            a50 r1 = r1.b
            zw2 r1 = (defpackage.zw2) r1
            r2.f(r0, r1)
            return
    }

    @Override // defpackage.u
    public final defpackage.b50 g(defpackage.am1 r3) {
            r2 = this;
            int r2 = r2.a
            r0 = 0
            switch(r2) {
                case 0: goto L20;
                default: goto L6;
            }
        L6:
            int r2 = r3.g
            r1 = 4
            if (r2 < r1) goto L16
            int r2 = r3.c
            int r2 = r2 + r1
            b50 r0 = new b50
            r3 = -1
            r1 = 0
            r0.<init>(r3, r1, r2)
            goto L20
        L16:
            boolean r2 = r3.h
            if (r2 == 0) goto L20
            int r2 = r3.e
            b50 r0 = defpackage.b50.a(r2)
        L20:
            return r0
    }
}
