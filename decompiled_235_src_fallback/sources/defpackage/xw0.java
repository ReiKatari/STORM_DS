package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw0  reason: default package */
/* loaded from: classes.dex */
public final class xw0 extends defpackage.dm5 implements defpackage.eo2 {
    public int L;
    public int R;
    public int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.yw0 d0;

    public xw0(defpackage.yw0 r1, defpackage.r41 r2) {
            r0 = this;
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            rb6 r1 = (defpackage.rb6) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            xw0 r0 = (defpackage.xw0) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            xw0 r0 = new xw0
            yw0 r1 = r1.d0
            r0.<init>(r1, r2)
            r0.Z = r3
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            yw0 r1 = r0.d0
            ca4 r2 = r1.A
            o94 r3 = r1.L
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r0.Y
            r6 = 1
            if (r5 == 0) goto L2d
            if (r5 != r6) goto L26
            int r5 = r0.X
            int r7 = r0.R
            int r8 = r0.L
            java.lang.Object r9 = r0.Z
            rb6 r9 = (defpackage.rb6) r9
            defpackage.oi2.Y(r18)
            r16 = r6
            r6 = r5
            r5 = r7
            r7 = r16
            goto L178
        L26:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L2d:
            defpackage.oi2.Y(r18)
            java.lang.Object r5 = r0.Z
            rb6 r5 = (defpackage.rb6) r5
            r7 = 0
            r9 = r5
            r5 = r7
            r8 = r5
        L38:
            int r10 = r1.R
            int r10 = r10 + 10
            int r11 = r3.b
            int r10 = java.lang.Math.min(r10, r11)
            if (r7 >= r10) goto L180
            int r10 = r7 + 1
            int r11 = r3.c(r7)
            r12 = 32
            switch(r11) {
                case 0: goto L14c;
                case 1: goto L135;
                case 2: goto L110;
                case 3: goto Le0;
                case 4: goto Ldc;
                case 5: goto Lbb;
                case 6: goto L93;
                case 7: goto L75;
                case 8: goto L5d;
                case 9: goto L5a;
                default: goto L4f;
            }
        L4f:
            java.lang.String r12 = "unknown op: "
            java.lang.String r11 = defpackage.lb1.g(r11, r12)
        L55:
            r13 = r5
        L56:
            r5 = r8
            r8 = r10
            goto L150
        L5a:
            java.lang.String r11 = "recompose pending"
            goto L55
        L5d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "reuse "
            r11.<init>(r12)
            ca4 r12 = r1.B
            int r13 = r8 + 1
            java.lang.Object r8 = r12.f(r8)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            r8 = r13
            goto L55
        L75:
            java.lang.Object r11 = r2.f(r5)
            r11.getClass()
            r12 = 2
            defpackage.ge7.p(r12, r11)
            eo2 r11 = (defpackage.eo2) r11
            int r5 = r5 + 2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "apply "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            goto L55
        L93:
            int r11 = r7 + 2
            int r10 = r3.c(r10)
            int r13 = r5 + 1
            java.lang.Object r5 = r2.f(r5)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "insertTopDown "
            r14.<init>(r15)
            r14.append(r10)
            r14.append(r12)
            r14.append(r5)
            java.lang.String r5 = r14.toString()
        Lb3:
            r16 = r11
            r11 = r5
            r5 = r8
            r8 = r16
            goto L150
        Lbb:
            int r11 = r7 + 2
            int r10 = r3.c(r10)
            int r13 = r5 + 1
            java.lang.Object r5 = r2.f(r5)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "insertBottomUp "
            r14.<init>(r15)
            r14.append(r10)
            r14.append(r12)
            r14.append(r5)
            java.lang.String r5 = r14.toString()
            goto Lb3
        Ldc:
            java.lang.String r11 = "clear"
            goto L55
        Le0:
            int r11 = r7 + 2
            int r10 = r3.c(r10)
            int r13 = r7 + 3
            int r11 = r3.c(r11)
            int r14 = r7 + 4
            int r13 = r3.c(r13)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r6 = "move "
            r15.<init>(r6)
            r15.append(r10)
            r15.append(r12)
            r15.append(r11)
            r15.append(r12)
            r15.append(r13)
            java.lang.String r11 = r15.toString()
            r13 = r5
            r5 = r8
            r8 = r14
            goto L150
        L110:
            int r6 = r7 + 2
            int r10 = r3.c(r10)
            int r11 = r7 + 3
            int r6 = r3.c(r6)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "remove "
            r13.<init>(r14)
            r13.append(r10)
            r13.append(r12)
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            r13 = r5
            r5 = r8
            r8 = r11
            r11 = r6
            goto L150
        L135:
            int r6 = r5 + 1
            java.lang.Object r5 = r2.f(r5)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "down "
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            r13 = r6
            goto L56
        L14c:
            java.lang.String r11 = "up"
            goto L55
        L150:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            java.lang.String r7 = ": "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r0.Z = r9
            r0.L = r8
            r0.R = r13
            r0.X = r5
            r7 = 1
            r0.Y = r7
            x61 r6 = r9.c(r0, r6)
            if (r6 != r4) goto L176
            return r4
        L176:
            r6 = r5
            r5 = r13
        L178:
            r16 = r8
            r8 = r6
            r6 = r7
            r7 = r16
            goto L38
        L180:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
