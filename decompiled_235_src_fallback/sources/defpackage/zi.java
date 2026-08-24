package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi  reason: default package */
/* loaded from: classes.dex */
public final class zi implements defpackage.sk0 {
    public final defpackage.t57 a;
    public final defpackage.kf0 b;
    public final defpackage.jr6 c;

    public zi(defpackage.t57 r1, defpackage.kf0 r2, defpackage.jr6 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.sk0
    public final defpackage.rk0 a(defpackage.bf0 r18, java.util.Map r19, defpackage.yk0 r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            d90 r2 = defpackage.d90.q0
            r1.getClass()
            r19.getClass()
            r20.getClass()
            kf0 r3 = r0.b
            int r4 = r3.h
            if (r4 != 0) goto L17
            r9 = 0
            goto L20
        L17:
            r7 = 1
            if (r4 != r7) goto L1c
            r9 = r7
            goto L20
        L1c:
            r7 = 2
            if (r4 == r7) goto L106
            r9 = r4
        L20:
            jr6 r4 = r0.c
            r7 = r19
            cp4 r4 = defpackage.l.k(r3, r4, r7)
            java.util.ArrayList r11 = r4.a
            boolean r7 = r11.isEmpty()
            java.lang.String r8 = "CXCP"
            if (r7 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to create OutputConfigurations for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r8, r0)
            r20.a()
            return r2
        L47:
            java.util.ArrayList r7 = r3.d
            if (r7 == 0) goto L8b
            java.util.ArrayList r10 = new java.util.ArrayList
            r12 = 10
            int r12 = defpackage.ht0.v0(r7, r12)
            r10.<init>(r12)
            int r12 = r7.size()
            r13 = 0
        L5b:
            if (r13 >= r12) goto L88
            java.lang.Object r14 = r7.get(r13)
            int r13 = r13 + 1
            y73 r14 = (defpackage.y73) r14
            ji0 r14 = r14.a
            java.util.List r14 = r14.a
            java.lang.Object r14 = defpackage.gt0.b1(r14)
            pp4 r14 = (defpackage.pp4) r14
            j63 r15 = new j63
            r16 = 0
            android.util.Size r5 = r14.a
            int r5 = r5.getWidth()
            android.util.Size r6 = r14.a
            int r6 = r6.getHeight()
            int r14 = r14.b
            r15.<init>(r5, r6, r14)
            r10.add(r15)
            goto L5b
        L88:
            r16 = 0
            goto L8f
        L8b:
            r16 = 0
            r10 = r16
        L8f:
            if (r10 == 0) goto Lbb
            boolean r5 = r10.isEmpty()
            if (r5 == 0) goto L98
            goto Lbb
        L98:
            int r5 = r10.size()
            r6 = 0
        L9d:
            if (r6 >= r5) goto Lbb
            java.lang.Object r7 = r10.get(r6)
            int r6 = r6 + 1
            j63 r7 = (defpackage.j63) r7
            int r7 = r7.c
            r12 = 0
            java.lang.Object r13 = r10.get(r12)
            j63 r13 = (defpackage.j63) r13
            int r13 = r13.c
            if (r7 != r13) goto Lb5
            goto L9d
        Lb5:
            java.lang.String r0 = "All InputStream.Config objects must have the same format for multi resolution"
            defpackage.i.m(r0)
            return r16
        Lbb:
            r5 = r8
            uc6 r8 = new uc6
            t57 r0 = r0.a
            ex6 r0 = r0.j
            java.lang.Object r0 = r0.getValue()
            r12 = r0
            java.util.concurrent.Executor r12 = (java.util.concurrent.Executor) r12
            int r14 = r3.f
            java.util.Map r15 = r3.g
            r13 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r1.A(r8)
            if (r0 != 0) goto Lfc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to create capture session from "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " for "
            r0.append(r1)
            r13 = r20
            r0.append(r13)
            r1 = 33
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r5, r0)
            r13.a()
            return r2
        Lfc:
            qk0 r0 = new qk0
            java.util.LinkedHashMap r1 = r4.b
            java.util.LinkedHashMap r2 = r4.d
            r0.<init>(r1, r2)
            return r0
        L106:
            r16 = 0
            int r0 = r3.h
            java.lang.String r0 = defpackage.q60.Z(r0)
            java.lang.String r1 = "Unsupported session mode: "
            defpackage.e41.A(r0, r1)
            return r16
    }
}
