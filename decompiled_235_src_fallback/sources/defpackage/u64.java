package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u64  reason: default package */
/* loaded from: classes.dex */
public final class u64 extends android.view.View implements defpackage.r03 {
    public final android.graphics.Paint A;
    public final android.graphics.Paint B;
    public final android.graphics.Paint L;
    public final android.graphics.Paint R;
    public final android.graphics.Paint d0;
    public final android.graphics.Paint e0;
    public final android.graphics.Paint f0;
    public final android.graphics.Paint g0;
    public final android.graphics.Paint h0;
    public final android.graphics.Paint i0;
    public final java.util.List j0;
    public final java.util.LinkedHashMap k0;
    public final java.util.LinkedHashMap l0;
    public final java.util.LinkedHashSet m0;
    public final java.util.LinkedHashMap n0;
    public final android.os.Handler o0;

    public u64(android.content.Context r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r5.<init>(r6, r0, r1)
            defpackage.n90.a(r6)
            android.graphics.Paint r6 = new android.graphics.Paint
            r0 = 1
            r6.<init>(r0)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r6.setStyle(r1)
            java.lang.String r2 = "#330F1117"
            int r2 = android.graphics.Color.parseColor(r2)
            r6.setColor(r2)
            r5.A = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r2)
            r3 = 1077936128(0x40400000, float:3.0)
            r6.setStrokeWidth(r3)
            java.lang.String r3 = "#33FFFFFF"
            int r3 = android.graphics.Color.parseColor(r3)
            r6.setColor(r3)
            r5.B = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            java.lang.String r3 = "#E6232730"
            int r3 = android.graphics.Color.parseColor(r3)
            r6.setColor(r3)
            r5.L = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r2)
            r3 = 1080033280(0x40600000, float:3.5)
            r6.setStrokeWidth(r3)
            java.lang.String r4 = "#80FFFFFF"
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setColor(r4)
            r5.R = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r2)
            r6.setStrokeWidth(r3)
            java.lang.String r3 = "#80000000"
            int r4 = android.graphics.Color.parseColor(r3)
            r6.setColor(r4)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            java.lang.String r4 = "#59000000"
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setColor(r4)
            r5.d0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            java.lang.String r4 = "#CC1A1C22"
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setColor(r4)
            r5.e0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r2)
            r4 = 1075838976(0x40200000, float:2.5)
            r6.setStrokeWidth(r4)
            java.lang.String r4 = "#4DFFFFFF"
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setColor(r4)
            r5.f0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            java.lang.String r4 = "#6600E5FF"
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setColor(r4)
            r5.g0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r2)
            r2 = 1084227584(0x40a00000, float:5.0)
            r6.setStrokeWidth(r2)
            java.lang.String r2 = "#FF00E5FF"
            int r2 = android.graphics.Color.parseColor(r2)
            r6.setColor(r2)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            java.lang.String r2 = "#F0F4F8"
            int r2 = android.graphics.Color.parseColor(r2)
            r6.setColor(r2)
            r5.h0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            int r0 = android.graphics.Color.parseColor(r3)
            r6.setColor(r0)
            r5.i0 = r6
            b63 r6 = defpackage.b63.UP
            b63 r0 = defpackage.b63.LEFT
            b63 r1 = defpackage.b63.DOWN
            b63 r2 = defpackage.b63.RIGHT
            b63[] r6 = new defpackage.b63[]{r6, r0, r1, r2}
            java.util.List r6 = defpackage.hf.c0(r6)
            r5.j0 = r6
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.k0 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.l0 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5.m0 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.n0 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r5.o0 = r0
            java.util.Iterator r6 = r6.iterator()
        L144:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L166
            java.lang.Object r0 = r6.next()
            b63 r0 = (defpackage.b63) r0
            java.util.LinkedHashMap r1 = r5.k0
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.put(r0, r2)
            java.util.LinkedHashMap r1 = r5.l0
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.put(r0, r2)
            goto L144
        L166:
            return
    }

    @Override // defpackage.r03
    public final void a(java.util.Set r13) {
            r12 = this;
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            java.util.List r3 = r12.j0
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9d
            java.lang.Object r4 = r3.next()
            b63 r4 = (defpackage.b63) r4
            boolean r5 = r13.contains(r4)
            java.util.LinkedHashMap r6 = r12.k0
            java.lang.Object r7 = r6.get(r4)
            java.lang.Float r7 = (java.lang.Float) r7
            if (r7 == 0) goto L30
            float r7 = r7.floatValue()
            goto L31
        L30:
            r7 = r1
        L31:
            r8 = 1064514355(0x3f733333, float:0.95)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            r8 = 1
            if (r7 >= 0) goto L3b
            r7 = r8
            goto L3c
        L3b:
            r7 = 0
        L3c:
            android.os.Handler r9 = r12.o0
            java.util.LinkedHashMap r10 = r12.n0
            java.util.LinkedHashMap r11 = r12.l0
            if (r5 == 0) goto L61
            if (r7 != 0) goto L11
            r5 = 1063675494(0x3f666666, float:0.9)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6.put(r4, r5)
            r11.put(r4, r2)
            q64 r5 = new q64
            r5.<init>(r8, r12, r4)
            r10.put(r4, r5)
            r6 = 3000(0xbb8, double:1.482E-320)
            r9.postDelayed(r5, r6)
            goto L11
        L61:
            java.util.LinkedHashSet r5 = r12.m0
            if (r7 == 0) goto L87
            java.lang.Object r7 = r10.remove(r4)
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            if (r7 == 0) goto L70
            r9.removeCallbacks(r7)
        L70:
            boolean r7 = r5.contains(r4)
            if (r7 == 0) goto L80
            r5.remove(r4)
            r6.put(r4, r2)
            r11.put(r4, r0)
            goto L11
        L80:
            r6.put(r4, r2)
            r11.put(r4, r0)
            goto L11
        L87:
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L95
            r6.put(r4, r2)
            r11.put(r4, r2)
            goto L11
        L95:
            r6.put(r4, r2)
            r11.put(r4, r0)
            goto L11
        L9d:
            r12.invalidate()
            return
    }

    public final void b(android.graphics.Canvas r4, float r5, float r6, float r7, float r8) {
            r3 = this;
            r4.save()
            r4.rotate(r8, r5, r6)
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            float r0 = r6 - r7
            r8.moveTo(r5, r0)
            r0 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r7
            float r1 = r5 + r0
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r2 = r2 * r7
            float r2 = r2 + r6
            r8.lineTo(r1, r2)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r7 = r7 * r1
            float r7 = r7 + r6
            r8.lineTo(r5, r7)
            float r5 = r5 - r0
            r8.lineTo(r5, r2)
            r8.close()
            android.graphics.Paint r5 = r3.i0
            r4.drawPath(r8, r5)
            android.graphics.Paint r3 = r3.h0
            r4.drawPath(r8, r3)
            r4.restore()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r32) {
            r31 = this;
            r0 = r31
            r1 = r32
            r1.getClass()
            super.onDraw(r32)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L55e
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 > 0) goto L1f
            goto L55e
        L1f:
            float r5 = java.lang.Math.min(r2, r3)
            r6 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r6
            float r7 = r3 / r6
            r3 = 1050924810(0x3ea3d70a, float:0.32)
            float r3 = r3 * r5
            r8 = 1055622431(0x3eeb851f, float:0.46)
            float r8 = r8 * r5
            r9 = 1031127695(0x3d75c28f, float:0.06)
            float r9 = r9 * r5
            j90 r10 = defpackage.n90.a
            int[] r11 = defpackage.t64.a
            int r12 = r10.ordinal()
            r11 = r11[r12]
            java.lang.String r12 = "#6600D2FF"
            java.lang.String r13 = "#E2E8F0"
            java.lang.String r14 = "#80CBD5E1"
            java.lang.String r15 = "#F2FFFFFF"
            java.lang.String r16 = "#4D38BDF8"
            java.lang.String r17 = "#80FF0033"
            java.lang.String r18 = "#33FFFFFF"
            r19 = r4
            android.graphics.Paint r4 = r0.B
            r20 = r6
            android.graphics.Paint r6 = r0.A
            r21 = r3
            android.graphics.Paint r3 = r0.e0
            r22 = r5
            android.graphics.Paint r5 = r0.R
            r23 = r8
            android.graphics.Paint r8 = r0.L
            switch(r11) {
                case 1: goto L310;
                case 2: goto L2e2;
                case 3: goto L2b4;
                case 4: goto L285;
                case 5: goto L256;
                case 6: goto L227;
                case 7: goto L202;
                case 8: goto L1d5;
                case 9: goto L1a8;
                case 10: goto L1a8;
                case 11: goto L17b;
                case 12: goto L14c;
                case 13: goto L11d;
                case 14: goto Lee;
                case 15: goto Lbf;
                case 16: goto L90;
                default: goto L63;
            }
        L63:
            java.lang.String r11 = "#E6232730"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#66FFFFFF"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC1A1C22"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#330F1117"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r18)
            r4.setColor(r11)
            goto L337
        L90:
            java.lang.String r11 = "#E6004D40"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#8000D2D3"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC002B24"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#33004E64"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4D00A896"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        Lbf:
            java.lang.String r11 = "#E68B0000"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#80FFD700"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC4A0000"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#33B8860B"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4DDAA520"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        Lee:
            java.lang.String r11 = "#E64A69BD"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#80706FD3"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC2C2C54"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#334A69BD"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4D6A89CC"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L11d:
            java.lang.String r11 = "#E65A5A66"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#808E8E93"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC3A3A44"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#338E8E93"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4D5856D6"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L14c:
            java.lang.String r11 = "#E63C3B6E"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#806C5CE7"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC2A2952"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#333C3B6E"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4D6C5CE7"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L17b:
            java.lang.String r11 = "#E61A0005"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r17)
            r5.setColor(r11)
            java.lang.String r11 = "#CC0A0002"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#40000000"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#66FF0033"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L1a8:
            java.lang.String r11 = "#E61E293B"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#8064748B"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC0F172A"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#330F172A"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r16)
            r4.setColor(r11)
            goto L337
        L1d5:
            java.lang.String r11 = "#E61E222B"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#80475569"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC111318"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#331E222B"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r16)
            r4.setColor(r11)
            goto L337
        L202:
            int r11 = android.graphics.Color.parseColor(r15)
            r8.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r14)
            r5.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r13)
            r3.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r18)
            r6.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r12)
            r4.setColor(r11)
            goto L337
        L227:
            java.lang.String r11 = "#E6047857"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#8034D399"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC064E3B"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#33052614"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4D00E676"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L256:
            java.lang.String r11 = "#E6B45309"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#80FBBF24"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC78350F"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#332A200B"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4DD4A017"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L285:
            java.lang.String r11 = "#E6491979"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#80C084FC"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC2D0B4E"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#331F1738"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4DC084FC"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L2b4:
            java.lang.String r11 = "#E68F0E17"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#80FF2A37"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC5C060D"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#332D0608"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4DE50914"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L2e2:
            java.lang.String r11 = "#E65A6577"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            java.lang.String r11 = "#80D1D5DB"
            int r11 = android.graphics.Color.parseColor(r11)
            r5.setColor(r11)
            java.lang.String r11 = "#CC475569"
            int r11 = android.graphics.Color.parseColor(r11)
            r3.setColor(r11)
            java.lang.String r11 = "#33475569"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4D94A3B8"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            goto L337
        L310:
            int r11 = android.graphics.Color.parseColor(r15)
            r8.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r14)
            r5.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r13)
            r3.setColor(r11)
            java.lang.String r11 = "#33E2E8F0"
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setColor(r11)
            java.lang.String r11 = "#4DE2E8F0"
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
        L337:
            r11 = 1065772646(0x3f866666, float:1.05)
            float r11 = r11 * r23
            r1.drawCircle(r2, r7, r11, r6)
            r1.drawCircle(r2, r7, r11, r4)
            float r4 = r21 / r20
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            float r11 = r2 - r4
            float r13 = r11 + r9
            float r14 = r7 - r23
            r6.moveTo(r13, r14)
            float r15 = r2 + r4
            r16 = r4
            float r4 = r15 - r9
            r6.lineTo(r4, r14)
            r18 = r10
            float r10 = r14 + r9
            r6.quadTo(r15, r14, r15, r10)
            r21 = r12
            float r12 = r7 - r16
            r6.lineTo(r15, r12)
            r24 = r2
            float r2 = r24 + r23
            r25 = r3
            float r3 = r2 - r9
            r6.lineTo(r3, r12)
            r26 = r7
            float r7 = r12 + r9
            r6.quadTo(r2, r12, r2, r7)
            r27 = r9
            float r9 = r26 + r16
            r28 = r5
            float r5 = r9 - r27
            r6.lineTo(r2, r5)
            r6.quadTo(r2, r9, r3, r9)
            r6.lineTo(r15, r9)
            float r3 = r26 + r23
            r29 = r2
            float r2 = r3 - r27
            r6.lineTo(r15, r2)
            r6.quadTo(r15, r3, r4, r3)
            r6.lineTo(r13, r3)
            r6.quadTo(r11, r3, r11, r2)
            r6.lineTo(r11, r9)
            float r2 = r24 - r23
            float r4 = r2 + r27
            r6.lineTo(r4, r9)
            r6.quadTo(r2, r9, r2, r5)
            r6.lineTo(r2, r7)
            r6.quadTo(r2, r12, r4, r12)
            r6.lineTo(r11, r12)
            r6.lineTo(r11, r10)
            r6.quadTo(r11, r14, r13, r14)
            r6.close()
            r1.save()
            r4 = 1075838976(0x40200000, float:2.5)
            r5 = 1083179008(0x40900000, float:4.5)
            r1.translate(r4, r5)
            android.graphics.Paint r4 = r0.d0
            r1.drawPath(r6, r4)
            r1.restore()
            r1.drawPath(r6, r8)
            r4 = r28
            r1.drawPath(r6, r4)
            java.util.List r4 = r0.j0
            java.util.Iterator r4 = r4.iterator()
        L3dd:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto L4da
            java.lang.Object r5 = r4.next()
            b63 r5 = (defpackage.b63) r5
            java.util.LinkedHashMap r7 = r0.l0
            java.lang.Object r7 = r7.get(r5)
            java.lang.Float r7 = (java.lang.Float) r7
            if (r7 == 0) goto L3f9
            float r7 = r7.floatValue()
            goto L3fb
        L3f9:
            r7 = r19
        L3fb:
            int r8 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r8 <= 0) goto L4d0
            int[] r8 = defpackage.t64.a
            int r10 = r18.ordinal()
            r8 = r8[r10]
            java.lang.String r10 = "#6638BDF8"
            r13 = 2
            java.lang.String r28 = "#6694A3B8"
            java.lang.String r30 = "#66FFD700"
            switch(r8) {
                case 1: goto L489;
                case 2: goto L484;
                case 3: goto L47d;
                case 4: goto L476;
                case 5: goto L471;
                case 6: goto L46a;
                case 7: goto L465;
                case 8: goto L460;
                case 9: goto L446;
                case 10: goto L441;
                case 11: goto L43c;
                case 12: goto L435;
                case 13: goto L42e;
                case 14: goto L427;
                case 15: goto L421;
                case 16: goto L419;
                default: goto L411;
            }
        L411:
            java.lang.String r8 = "#6600E5FF"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L419:
            java.lang.String r8 = "#6600D2D3"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L421:
            int r8 = android.graphics.Color.parseColor(r30)
            goto L48d
        L427:
            java.lang.String r8 = "#66706FD3"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L42e:
            java.lang.String r8 = "#66C70039"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L435:
            java.lang.String r8 = "#666C5CE7"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L43c:
            int r8 = android.graphics.Color.parseColor(r17)
            goto L48d
        L441:
            int r8 = android.graphics.Color.parseColor(r28)
            goto L48d
        L446:
            int[] r8 = defpackage.t64.b
            int r10 = r5.ordinal()
            r8 = r8[r10]
            if (r8 == r6) goto L459
            if (r8 == r13) goto L459
            java.lang.String r8 = "#660AB9E6"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L459:
            java.lang.String r8 = "#66FF3E3E"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L460:
            int r8 = android.graphics.Color.parseColor(r10)
            goto L48d
        L465:
            int r8 = android.graphics.Color.parseColor(r21)
            goto L48d
        L46a:
            java.lang.String r8 = "#6600E676"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L471:
            int r8 = android.graphics.Color.parseColor(r30)
            goto L48d
        L476:
            java.lang.String r8 = "#66C084FC"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L47d:
            java.lang.String r8 = "#66FF1744"
            int r8 = android.graphics.Color.parseColor(r8)
            goto L48d
        L484:
            int r8 = android.graphics.Color.parseColor(r28)
            goto L48d
        L489:
            int r8 = android.graphics.Color.parseColor(r10)
        L48d:
            android.graphics.Paint r10 = r0.g0
            r10.setColor(r8)
            r8 = 1127481344(0x43340000, float:180.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            r10.setAlpha(r7)
            int[] r7 = defpackage.t64.b
            int r5 = r5.ordinal()
            r5 = r7[r5]
            if (r5 == r6) goto L4c1
            if (r5 == r13) goto L4bb
            r6 = 3
            if (r5 == r6) goto L4b5
            r6 = 4
            if (r5 == r6) goto L4af
            r5 = 0
        L4ac:
            r7 = r29
            goto L4c8
        L4af:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r2, r12, r11, r9)
            goto L4ac
        L4b5:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r11, r14, r15, r12)
            goto L4ac
        L4bb:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r11, r9, r15, r3)
            goto L4ac
        L4c1:
            android.graphics.RectF r5 = new android.graphics.RectF
            r7 = r29
            r5.<init>(r15, r12, r7, r9)
        L4c8:
            r8 = r27
            if (r5 == 0) goto L4d4
            r1.drawRoundRect(r5, r8, r8, r10)
            goto L4d4
        L4d0:
            r8 = r27
            r7 = r29
        L4d4:
            r29 = r7
            r27 = r8
            goto L3dd
        L4da:
            r2 = 1040522936(0x3e051eb8, float:0.13)
            float r5 = r22 * r2
            r2 = r24
            r3 = r25
            r7 = r26
            r1.drawCircle(r2, r7, r5, r3)
            android.graphics.Paint r3 = r0.f0
            r1.drawCircle(r2, r7, r5, r3)
            float r8 = r23 + r16
            float r8 = r8 / r20
            r3 = 1064514355(0x3f733333, float:0.95)
            float r8 = r8 * r3
            r3 = 1029785518(0x3d6147ae, float:0.055)
            float r4 = r22 * r3
            int[] r3 = defpackage.t64.a
            int r5 = r18.ordinal()
            r3 = r3[r5]
            if (r3 == r6) goto L52f
            r5 = 7
            if (r3 == r5) goto L52f
            r5 = 11
            if (r3 == r5) goto L528
            r5 = 15
            if (r3 == r5) goto L521
            r5 = 16
            if (r3 == r5) goto L51a
            java.lang.String r3 = "#F0F4F8"
            int r3 = android.graphics.Color.parseColor(r3)
            goto L535
        L51a:
            java.lang.String r3 = "#00FFFF"
            int r3 = android.graphics.Color.parseColor(r3)
            goto L535
        L521:
            java.lang.String r3 = "#FFD700"
            int r3 = android.graphics.Color.parseColor(r3)
            goto L535
        L528:
            java.lang.String r3 = "#FF0033"
            int r3 = android.graphics.Color.parseColor(r3)
            goto L535
        L52f:
            java.lang.String r3 = "#0F172A"
            int r3 = android.graphics.Color.parseColor(r3)
        L535:
            android.graphics.Paint r5 = r0.h0
            r5.setColor(r3)
            float r3 = r7 - r8
            r5 = 0
            r0.b(r1, r2, r3, r4, r5)
            r24 = r2
            float r2 = r24 + r8
            r5 = 1119092736(0x42b40000, float:90.0)
            r0 = r31
            r1 = r32
            r3 = r7
            r0.b(r1, r2, r3, r4, r5)
            float r3 = r7 + r8
            r5 = 1127481344(0x43340000, float:180.0)
            r2 = r24
            r0.b(r1, r2, r3, r4, r5)
            float r2 = r2 - r8
            r5 = 1132920832(0x43870000, float:270.0)
            r3 = r7
            r0.b(r1, r2, r3, r4, r5)
        L55e:
            return
    }
}
