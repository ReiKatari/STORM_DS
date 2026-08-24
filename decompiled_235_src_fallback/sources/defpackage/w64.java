package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w64  reason: default package */
/* loaded from: classes.dex */
public final class w64 extends android.view.View implements defpackage.r03 {
    public final defpackage.nj3 A;
    public final android.graphics.Paint B;
    public final android.graphics.Paint L;
    public final android.graphics.Paint R;
    public final android.graphics.Paint d0;
    public final android.graphics.Paint e0;
    public final android.graphics.Paint f0;
    public final android.graphics.Paint g0;
    public final android.graphics.Paint h0;
    public final android.graphics.Paint i0;
    public float j0;
    public float k0;
    public boolean l0;
    public boolean m0;
    public defpackage.rk3 n0;
    public final android.os.Handler o0;

    public w64(android.content.Context r7, defpackage.nj3 r8) {
            r6 = this;
            r0 = 0
            r1 = 0
            r6.<init>(r7, r0, r1)
            r6.A = r8
            defpackage.n90.a(r7)
            android.graphics.Paint r7 = new android.graphics.Paint
            r8 = 1
            r7.<init>(r8)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r7.setStyle(r0)
            java.lang.String r1 = "#E6232730"
            int r1 = android.graphics.Color.parseColor(r1)
            r7.setColor(r1)
            r6.B = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r1)
            r2 = 1077936128(0x40400000, float:3.0)
            r7.setStrokeWidth(r2)
            java.lang.String r3 = "#66FFFFFF"
            int r3 = android.graphics.Color.parseColor(r3)
            r7.setColor(r3)
            r6.L = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            r7.setStyle(r0)
            java.lang.String r3 = "#59000000"
            int r3 = android.graphics.Color.parseColor(r3)
            r7.setColor(r3)
            r6.R = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            r7.setStyle(r0)
            java.lang.String r0 = "#6600E5FF"
            int r0 = android.graphics.Color.parseColor(r0)
            r7.setColor(r0)
            r6.d0 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            r7.setStyle(r1)
            r0 = 1083179008(0x40900000, float:4.5)
            r7.setStrokeWidth(r0)
            java.lang.String r0 = "#FF00E5FF"
            int r0 = android.graphics.Color.parseColor(r0)
            r7.setColor(r0)
            r6.e0 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r7.setStyle(r0)
            r7.setStrokeWidth(r2)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r7.setStrokeCap(r1)
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r7.setStrokeJoin(r3)
            java.lang.String r4 = "#F0F4F8"
            int r5 = android.graphics.Color.parseColor(r4)
            r7.setColor(r5)
            r6.f0 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            r7.setStyle(r0)
            r7.setStrokeWidth(r2)
            r7.setStrokeCap(r1)
            r7.setStrokeJoin(r3)
            java.lang.String r0 = "#99000000"
            int r1 = android.graphics.Color.parseColor(r0)
            r7.setColor(r1)
            r6.g0 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            int r1 = android.graphics.Color.parseColor(r4)
            r7.setColor(r1)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r7.setTextAlign(r1)
            java.lang.String r2 = "sans-serif-medium"
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r2, r8)
            r7.setTypeface(r3)
            r6.h0 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r8)
            int r0 = android.graphics.Color.parseColor(r0)
            r7.setColor(r0)
            r7.setTextAlign(r1)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r2, r8)
            r7.setTypeface(r0)
            r6.i0 = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.j0 = r7
            r6.l0 = r8
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            r6.o0 = r7
            return
    }

    private final java.lang.String getLabel() {
            r1 = this;
            nj3 r1 = r1.A
            if (r1 != 0) goto L6
            r1 = -1
            goto Le
        L6:
            int[] r0 = defpackage.v64.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
        Le:
            r0 = 1
            if (r1 == r0) goto L26
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L20
            r0 = 4
            if (r1 == r0) goto L1d
            java.lang.String r1 = ""
            return r1
        L1d:
            java.lang.String r1 = "SELECT"
            return r1
        L20:
            java.lang.String r1 = "START"
            return r1
        L23:
            java.lang.String r1 = "R"
            return r1
        L26:
            java.lang.String r1 = "L"
            return r1
    }

    @Override // defpackage.r03
    public final void a(java.util.Set r5) {
            r4 = this;
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            float r0 = r4.j0
            r1 = 1064514355(0x3f733333, float:0.95)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = r1
        L13:
            android.os.Handler r2 = r4.o0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r5 != 0) goto L30
            if (r0 != 0) goto L5a
            r5 = 1063004406(0x3f5c28f6, float:0.86)
            r4.j0 = r5
            r4.k0 = r3
            rk3 r5 = new rk3
            r0 = 4
            r5.<init>(r4, r0)
            r4.n0 = r5
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.postDelayed(r5, r0)
            goto L5a
        L30:
            r5 = 0
            if (r0 == 0) goto L4d
            rk3 r0 = r4.n0
            if (r0 == 0) goto L3a
            r2.removeCallbacks(r0)
        L3a:
            r0 = 0
            r4.n0 = r0
            boolean r0 = r4.m0
            if (r0 == 0) goto L48
            r4.m0 = r1
            r4.j0 = r3
            r4.k0 = r5
            goto L5a
        L48:
            r4.j0 = r3
            r4.k0 = r5
            goto L5a
        L4d:
            boolean r0 = r4.m0
            if (r0 == 0) goto L56
            r4.j0 = r3
            r4.k0 = r3
            goto L5a
        L56:
            r4.j0 = r3
            r4.k0 = r5
        L5a:
            r4.invalidate()
            return
    }

    public final void b(android.graphics.Canvas r19, float r20, float r21, java.lang.String r22, float r23, float r24, defpackage.j90 r25) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r23
            android.graphics.Paint r5 = r0.h0
            r5.setTextSize(r4)
            float r6 = r5.measureText(r3)
            int r7 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            r8 = 0
            if (r7 <= 0) goto L22
            int r7 = (r24 > r8 ? 1 : (r24 == r8 ? 0 : -1))
            if (r7 <= 0) goto L22
            float r6 = r24 / r6
            float r6 = r6 * r4
            r5.setTextSize(r6)
        L22:
            float r4 = r5.getTextSize()
            android.graphics.Paint r6 = r0.i0
            r6.setTextSize(r4)
            float r4 = r5.descent()
            float r7 = r5.ascent()
            float r7 = r7 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r4
            float r4 = r21 - r7
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r7 = r7 + r4
            r1.drawText(r3, r2, r7, r6)
            float r0 = r0.k0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            java.lang.String r6 = "#0F172A"
            java.lang.String r7 = "#FF0033"
            java.lang.String r8 = "#00FFFF"
            r9 = -1
            r10 = 16
            r11 = 15
            r12 = 11
            r13 = 10
            r14 = 7
            r15 = 1
            java.lang.String r16 = "#FFD700"
            if (r0 <= 0) goto Lb1
            int[] r0 = defpackage.v64.b
            int r17 = r25.ordinal()
            r0 = r0[r17]
            if (r0 == r15) goto La7
            r15 = 3
            if (r0 == r15) goto La0
            r15 = 4
            if (r0 == r15) goto L99
            r15 = 5
            if (r0 == r15) goto L94
            r15 = 6
            if (r0 == r15) goto L8d
            if (r0 == r14) goto La7
            if (r0 == r13) goto L88
            if (r0 == r12) goto L83
            if (r0 == r11) goto L7e
            if (r0 == r10) goto L79
            goto Lad
        L79:
            int r9 = android.graphics.Color.parseColor(r8)
            goto Lad
        L7e:
            int r9 = android.graphics.Color.parseColor(r16)
            goto Lad
        L83:
            int r9 = android.graphics.Color.parseColor(r7)
            goto Lad
        L88:
            int r9 = android.graphics.Color.parseColor(r6)
            goto Lad
        L8d:
            java.lang.String r0 = "#00E676"
            int r9 = android.graphics.Color.parseColor(r0)
            goto Lad
        L94:
            int r9 = android.graphics.Color.parseColor(r16)
            goto Lad
        L99:
            java.lang.String r0 = "#C084FC"
            int r9 = android.graphics.Color.parseColor(r0)
            goto Lad
        La0:
            java.lang.String r0 = "#FF1744"
            int r9 = android.graphics.Color.parseColor(r0)
            goto Lad
        La7:
            java.lang.String r0 = "#0284C7"
            int r9 = android.graphics.Color.parseColor(r0)
        Lad:
            r5.setColor(r9)
            goto Le7
        Lb1:
            int[] r0 = defpackage.v64.b
            int r17 = r25.ordinal()
            r0 = r0[r17]
            if (r0 == r15) goto Le0
            if (r0 == r14) goto Le0
            r14 = 13
            if (r0 == r14) goto Ld9
            if (r0 == r13) goto Le0
            if (r0 == r12) goto Ld4
            if (r0 == r11) goto Lcf
            if (r0 == r10) goto Lca
            goto Le4
        Lca:
            int r9 = android.graphics.Color.parseColor(r8)
            goto Le4
        Lcf:
            int r9 = android.graphics.Color.parseColor(r16)
            goto Le4
        Ld4:
            int r9 = android.graphics.Color.parseColor(r7)
            goto Le4
        Ld9:
            java.lang.String r0 = "#F2C9D8"
            int r9 = android.graphics.Color.parseColor(r0)
            goto Le4
        Le0:
            int r9 = android.graphics.Color.parseColor(r6)
        Le4:
            r5.setColor(r9)
        Le7:
            r1.drawText(r3, r2, r4, r5)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r41) {
            r40 = this;
            r0 = r40
            r1 = r41
            r1.getClass()
            super.onDraw(r41)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L8fd
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 > 0) goto L1f
            goto L8fd
        L1f:
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r2 / r5
            float r7 = r3 / r5
            r1.save()
            float r8 = r0.j0
            r1.scale(r8, r8, r6, r7)
            android.graphics.RectF r8 = new android.graphics.RectF
            r9 = 1082130432(0x40800000, float:4.0)
            float r10 = r2 - r9
            float r11 = r3 - r9
            r8.<init>(r9, r9, r10, r11)
            r10 = r7
            j90 r7 = defpackage.n90.a
            int[] r11 = defpackage.v64.b
            int r12 = r7.ordinal()
            r12 = r11[r12]
            java.lang.String r13 = "#F2FFFFFF"
            switch(r12) {
                case 1: goto Lb0;
                case 2: goto La9;
                case 3: goto La2;
                case 4: goto L9b;
                case 5: goto L94;
                case 6: goto L8d;
                case 7: goto L88;
                case 8: goto L81;
                case 9: goto L7a;
                case 10: goto L7a;
                case 11: goto L73;
                case 12: goto L6c;
                case 13: goto L65;
                case 14: goto L5e;
                case 15: goto L57;
                case 16: goto L50;
                default: goto L48;
            }
        L48:
            java.lang.String r12 = "#E6232730"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L50:
            java.lang.String r12 = "#E6006266"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L57:
            java.lang.String r12 = "#E68B0000"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L5e:
            java.lang.String r12 = "#E6575FCF"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L65:
            java.lang.String r12 = "#E6801336"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L6c:
            java.lang.String r12 = "#E63C3B6E"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L73:
            java.lang.String r12 = "#E61A0005"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L7a:
            java.lang.String r12 = "#E61E293B"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L81:
            java.lang.String r12 = "#E61E222B"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L88:
            int r12 = android.graphics.Color.parseColor(r13)
            goto Lb4
        L8d:
            java.lang.String r12 = "#E6047857"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L94:
            java.lang.String r12 = "#E6B45309"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        L9b:
            java.lang.String r12 = "#E6491979"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        La2:
            java.lang.String r12 = "#E68F0E17"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        La9:
            java.lang.String r12 = "#E65A6577"
            int r12 = android.graphics.Color.parseColor(r12)
            goto Lb4
        Lb0:
            int r12 = android.graphics.Color.parseColor(r13)
        Lb4:
            int r13 = r7.ordinal()
            r13 = r11[r13]
            switch(r13) {
                case 1: goto L127;
                case 2: goto L120;
                case 3: goto L119;
                case 4: goto L112;
                case 5: goto L10b;
                case 6: goto L104;
                case 7: goto Lfd;
                case 8: goto Lf6;
                case 9: goto Lef;
                case 10: goto Lef;
                case 11: goto Le8;
                case 12: goto Le1;
                case 13: goto Lda;
                case 14: goto Ld3;
                case 15: goto Lcc;
                case 16: goto Lc5;
                default: goto Lbd;
            }
        Lbd:
            java.lang.String r13 = "#E61A3A4D"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Lc5:
            java.lang.String r13 = "#E6002B36"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Lcc:
            java.lang.String r13 = "#E64A0000"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Ld3:
            java.lang.String r13 = "#E62C2C54"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Lda:
            java.lang.String r13 = "#E64A0E17"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Le1:
            java.lang.String r13 = "#E62A2952"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Le8:
            java.lang.String r13 = "#E60A0002"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Lef:
            java.lang.String r13 = "#E60F172A"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Lf6:
            java.lang.String r13 = "#E6111318"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        Lfd:
            java.lang.String r13 = "#E6DDE3EA"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        L104:
            java.lang.String r13 = "#E6064E3B"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        L10b:
            java.lang.String r13 = "#E678350F"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        L112:
            java.lang.String r13 = "#E62D0B4E"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        L119:
            java.lang.String r13 = "#E65C060D"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        L120:
            java.lang.String r13 = "#E6374151"
            int r13 = android.graphics.Color.parseColor(r13)
            goto L12d
        L127:
            java.lang.String r13 = "#E6E2E8F0"
            int r13 = android.graphics.Color.parseColor(r13)
        L12d:
            int r14 = r7.ordinal()
            r14 = r11[r14]
            java.lang.String r15 = "#80CBD5E1"
            java.lang.String r16 = "#80FF0033"
            switch(r14) {
                case 1: goto L1a8;
                case 2: goto L1a1;
                case 3: goto L19a;
                case 4: goto L193;
                case 5: goto L18c;
                case 6: goto L185;
                case 7: goto L180;
                case 8: goto L179;
                case 9: goto L172;
                case 10: goto L16b;
                case 11: goto L166;
                case 12: goto L15f;
                case 13: goto L158;
                case 14: goto L151;
                case 15: goto L14a;
                case 16: goto L142;
                default: goto L13a;
            }
        L13a:
            java.lang.String r14 = "#66FFFFFF"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L142:
            java.lang.String r14 = "#8000D2D3"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L14a:
            java.lang.String r14 = "#80FFD700"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L151:
            java.lang.String r14 = "#80706FD3"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L158:
            java.lang.String r14 = "#805856D6"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L15f:
            java.lang.String r14 = "#806C5CE7"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L166:
            int r14 = android.graphics.Color.parseColor(r16)
            goto L1ac
        L16b:
            java.lang.String r14 = "#80FFFFFF"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L172:
            java.lang.String r14 = "#80FF3B30"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L179:
            java.lang.String r14 = "#80475569"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L180:
            int r14 = android.graphics.Color.parseColor(r15)
            goto L1ac
        L185:
            java.lang.String r14 = "#8010B981"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L18c:
            java.lang.String r14 = "#80F59E0B"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L193:
            java.lang.String r14 = "#80C084FC"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L19a:
            java.lang.String r14 = "#80E50914"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L1a1:
            java.lang.String r14 = "#80D1D5DB"
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1ac
        L1a8:
            int r14 = android.graphics.Color.parseColor(r15)
        L1ac:
            int r15 = r7.ordinal()
            r15 = r11[r15]
            java.lang.String r17 = "#6638BDF8"
            java.lang.String r18 = "#6694A3B8"
            java.lang.String r19 = "#66FFD700"
            switch(r15) {
                case 1: goto L220;
                case 2: goto L21b;
                case 3: goto L214;
                case 4: goto L20d;
                case 5: goto L208;
                case 6: goto L201;
                case 7: goto L1fa;
                case 8: goto L1f5;
                case 9: goto L1ee;
                case 10: goto L1e9;
                case 11: goto L1e4;
                case 12: goto L1dd;
                case 13: goto L1d6;
                case 14: goto L1cf;
                case 15: goto L1ca;
                case 16: goto L1c3;
                default: goto L1bb;
            }
        L1bb:
            java.lang.String r15 = "#6600E5FF"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L1c3:
            java.lang.String r15 = "#6600D2D3"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L1ca:
            int r15 = android.graphics.Color.parseColor(r19)
            goto L224
        L1cf:
            java.lang.String r15 = "#66706FD3"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L1d6:
            java.lang.String r15 = "#66C70039"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L1dd:
            java.lang.String r15 = "#666C5CE7"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L1e4:
            int r15 = android.graphics.Color.parseColor(r16)
            goto L224
        L1e9:
            int r15 = android.graphics.Color.parseColor(r18)
            goto L224
        L1ee:
            java.lang.String r15 = "#66FF3E3E"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L1f5:
            int r15 = android.graphics.Color.parseColor(r17)
            goto L224
        L1fa:
            java.lang.String r15 = "#6600D2FF"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L201:
            java.lang.String r15 = "#6600E676"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L208:
            int r15 = android.graphics.Color.parseColor(r19)
            goto L224
        L20d:
            java.lang.String r15 = "#66C084FC"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L214:
            java.lang.String r15 = "#66FF1744"
            int r15 = android.graphics.Color.parseColor(r15)
            goto L224
        L21b:
            int r15 = android.graphics.Color.parseColor(r18)
            goto L224
        L220:
            int r15 = android.graphics.Color.parseColor(r17)
        L224:
            int r16 = r7.ordinal()
            r16 = r11[r16]
            java.lang.String r17 = "#0284C7"
            java.lang.String r18 = "#FF1744"
            java.lang.String r19 = "#C084FC"
            java.lang.String r20 = "#00E676"
            java.lang.String r21 = "#FFD700"
            switch(r16) {
                case 1: goto L2a4;
                case 2: goto L29d;
                case 3: goto L298;
                case 4: goto L293;
                case 5: goto L28e;
                case 6: goto L289;
                case 7: goto L282;
                case 8: goto L27b;
                case 9: goto L274;
                case 10: goto L26d;
                case 11: goto L266;
                case 12: goto L25f;
                case 13: goto L258;
                case 14: goto L251;
                case 15: goto L24c;
                case 16: goto L245;
                default: goto L237;
            }
        L237:
            java.lang.String r16 = "#FF00E5FF"
            int r16 = android.graphics.Color.parseColor(r16)
        L23d:
            r22 = r4
            r4 = r16
            r16 = r5
            goto L2a9
        L245:
            java.lang.String r16 = "#00D2D3"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L24c:
            int r16 = android.graphics.Color.parseColor(r21)
            goto L23d
        L251:
            java.lang.String r16 = "#706FD3"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L258:
            java.lang.String r16 = "#FF4081"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L25f:
            java.lang.String r16 = "#6C5CE7"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L266:
            java.lang.String r16 = "#FF0033"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L26d:
            java.lang.String r16 = "#FFFFFF"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L274:
            java.lang.String r16 = "#FF3E3E"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L27b:
            java.lang.String r16 = "#38BDF8"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L282:
            java.lang.String r16 = "#00D2FF"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L289:
            int r16 = android.graphics.Color.parseColor(r20)
            goto L23d
        L28e:
            int r16 = android.graphics.Color.parseColor(r21)
            goto L23d
        L293:
            int r16 = android.graphics.Color.parseColor(r19)
            goto L23d
        L298:
            int r16 = android.graphics.Color.parseColor(r18)
            goto L23d
        L29d:
            java.lang.String r16 = "#CBD5E1"
            int r16 = android.graphics.Color.parseColor(r16)
            goto L23d
        L2a4:
            int r16 = android.graphics.Color.parseColor(r17)
            goto L23d
        L2a9:
            android.graphics.Paint r5 = r0.L
            r5.setColor(r14)
            android.graphics.Paint r14 = r0.d0
            r14.setColor(r15)
            android.graphics.Paint r15 = r0.e0
            r15.setColor(r4)
            nj3 r4 = defpackage.nj3.BUTTON_L
            r23 = 0
            r24 = r9
            nj3 r9 = r0.A
            r25 = r6
            r26 = 1
            if (r9 == r4) goto L2ce
            nj3 r6 = defpackage.nj3.BUTTON_R
            if (r9 != r6) goto L2cb
            goto L2ce
        L2cb:
            r27 = r23
            goto L2d0
        L2ce:
            r27 = r26
        L2d0:
            nj3 r6 = defpackage.nj3.BUTTON_START
            if (r9 == r6) goto L2dc
            nj3 r6 = defpackage.nj3.BUTTON_SELECT
            if (r9 != r6) goto L2d9
            goto L2dc
        L2d9:
            r6 = r23
            goto L2de
        L2dc:
            r6 = r26
        L2de:
            r28 = 1090519040(0x41000000, float:8.0)
            r29 = 1055286886(0x3ee66666, float:0.45)
            r30 = 1126825984(0x432a0000, float:170.0)
            r31 = r6
            android.graphics.Paint r6 = r0.R
            r32 = 1048576000(0x3e800000, float:0.25)
            r33 = 1061158912(0x3f400000, float:0.75)
            r34 = r7
            android.graphics.Paint r7 = r0.B
            if (r27 == 0) goto L3a7
            float r11 = java.lang.Math.min(r2, r3)
            float r11 = r11 * r29
            r27 = r10
            android.graphics.Path r10 = new android.graphics.Path
            r10.<init>()
            r17 = 7
            r18 = 6
            r19 = 5
            r20 = 4
            r21 = 3
            r29 = 2
            r31 = r11
            r11 = 8
            if (r9 != r4) goto L32e
            float r4 = r31 * r32
            float r9 = r31 * r33
            float[] r11 = new float[r11]
            r11[r23] = r31
            r11[r26] = r31
            r11[r29] = r4
            r11[r21] = r4
            r11[r20] = r4
            r11[r19] = r4
            r11[r18] = r9
            r11[r17] = r9
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r10.addRoundRect(r8, r11, r4)
            goto L349
        L32e:
            float r4 = r31 * r32
            float r9 = r31 * r33
            float[] r11 = new float[r11]
            r11[r23] = r4
            r11[r26] = r4
            r11[r29] = r31
            r11[r21] = r31
            r11[r20] = r9
            r11[r19] = r9
            r11[r18] = r4
            r11[r17] = r4
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r10.addRoundRect(r8, r11, r4)
        L349:
            android.graphics.RectF r4 = new android.graphics.RectF
            float r9 = r8.left
            float r9 = r9 + r16
            float r11 = r8.top
            float r11 = r11 + r24
            r23 = r2
            float r2 = r8.right
            float r2 = r2 + r16
            float r8 = r8.bottom
            float r8 = r8 + r24
            r4.<init>(r9, r11, r2, r8)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r11 = r31 * r2
            r1.drawRoundRect(r4, r11, r11, r6)
            float r2 = r0.k0
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r2 <= 0) goto L382
            r7.setColor(r13)
            float r2 = r0.k0
            float r2 = r2 * r30
            int r2 = (int) r2
            r14.setAlpha(r2)
            r1.drawPath(r10, r14)
            r1.drawPath(r10, r7)
            r1.drawPath(r10, r15)
            goto L38b
        L382:
            r7.setColor(r12)
            r1.drawPath(r10, r7)
            r1.drawPath(r10, r5)
        L38b:
            java.lang.String r4 = r0.getLabel()
            r2 = r23
            float r3 = java.lang.Math.min(r2, r3)
            r5 = 1057300152(0x3f051eb8, float:0.52)
            float r5 = r5 * r3
            float r6 = r2 - r28
            r2 = r25
            r3 = r27
            r7 = r34
            r0.b(r1, r2, r3, r4, r5, r6, r7)
        L3a4:
            r0 = r1
            goto L8fa
        L3a7:
            r39 = r1
            r1 = r0
            r0 = r39
            r23 = 1080033280(0x40600000, float:3.5)
            if (r31 == 0) goto L435
            float r9 = java.lang.Math.min(r2, r3)
            r11 = 1054951342(0x3ee147ae, float:0.44)
            float r9 = r9 * r11
            android.graphics.RectF r11 = new android.graphics.RectF
            r27 = 1077936128(0x40400000, float:3.0)
            float r4 = r8.left
            float r4 = r4 + r16
            r31 = r10
            float r10 = r8.top
            float r10 = r10 + r23
            r35 = r2
            float r2 = r8.right
            float r2 = r2 + r16
            r36 = r3
            float r3 = r8.bottom
            float r3 = r3 + r23
            r11.<init>(r4, r10, r2, r3)
            r0.drawRoundRect(r11, r9, r9, r6)
            float r2 = r1.k0
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r2 <= 0) goto L40a
            r7.setColor(r13)
            float r2 = r1.k0
            float r2 = r2 * r30
            int r2 = (int) r2
            r14.setAlpha(r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r8.left
            float r3 = r3 - r27
            float r4 = r8.top
            float r4 = r4 - r27
            float r5 = r8.right
            float r5 = r5 + r27
            float r6 = r8.bottom
            float r6 = r6 + r27
            r2.<init>(r3, r4, r5, r6)
            float r4 = r9 + r27
            r0.drawRoundRect(r2, r4, r4, r14)
            r0.drawRoundRect(r8, r9, r9, r7)
            r0.drawRoundRect(r8, r9, r9, r15)
            goto L413
        L40a:
            r7.setColor(r12)
            r0.drawRoundRect(r8, r9, r9, r7)
            r0.drawRoundRect(r8, r9, r9, r5)
        L413:
            java.lang.String r4 = r1.getLabel()
            r2 = r35
            r3 = r36
            float r3 = java.lang.Math.min(r2, r3)
            r5 = 1050589266(0x3e9eb852, float:0.31)
            float r5 = r5 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r6 = r2 - r3
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r25
            r3 = r31
            r7 = r34
            r0.b(r1, r2, r3, r4, r5, r6, r7)
            goto L3a4
        L435:
            r4 = r34
            r27 = 1077936128(0x40400000, float:3.0)
            float r31 = java.lang.Math.min(r2, r3)
            r34 = 1052938076(0x3ec28f5c, float:0.38)
            r35 = r9
            float r9 = r31 * r34
            r31 = r10
            android.graphics.RectF r10 = new android.graphics.RectF
            r34 = r11
            float r11 = r8.left
            float r11 = r11 + r16
            r36 = r12
            float r12 = r8.top
            float r12 = r12 + r23
            r37 = r2
            float r2 = r8.right
            float r2 = r2 + r16
            r38 = r3
            float r3 = r8.bottom
            float r3 = r3 + r23
            r10.<init>(r11, r12, r2, r3)
            r0.drawRoundRect(r10, r9, r9, r6)
            float r2 = r1.k0
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r2 <= 0) goto L498
            r7.setColor(r13)
            float r2 = r1.k0
            float r2 = r2 * r30
            int r2 = (int) r2
            r14.setAlpha(r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r8.left
            float r3 = r3 - r27
            float r5 = r8.top
            float r5 = r5 - r27
            float r6 = r8.right
            float r6 = r6 + r27
            float r10 = r8.bottom
            float r10 = r10 + r27
            r2.<init>(r3, r5, r6, r10)
            float r3 = r9 + r27
            r0.drawRoundRect(r2, r3, r3, r14)
            r0.drawRoundRect(r8, r9, r9, r7)
            r0.drawRoundRect(r8, r9, r9, r15)
            goto L4ae
        L498:
            boolean r2 = r1.l0
            if (r2 == 0) goto L49f
            r12 = r36
            goto L4a5
        L49f:
            java.lang.String r2 = "#B3181B22"
            int r12 = android.graphics.Color.parseColor(r2)
        L4a5:
            r7.setColor(r12)
            r0.drawRoundRect(r8, r9, r9, r7)
            r0.drawRoundRect(r8, r9, r9, r5)
        L4ae:
            float r2 = r1.k0
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            r3 = -1
            android.graphics.Paint r5 = r1.h0
            android.graphics.Paint r6 = r1.f0
            if (r2 <= 0) goto L4ee
            int r2 = r4.ordinal()
            r2 = r34[r2]
            switch(r2) {
                case 1: goto L4df;
                case 2: goto L4dd;
                case 3: goto L4d8;
                case 4: goto L4d3;
                case 5: goto L4ce;
                case 6: goto L4c9;
                default: goto L4c2;
            }
        L4c2:
            java.lang.String r2 = "#00E5FF"
            int r2 = android.graphics.Color.parseColor(r2)
            goto L4e3
        L4c9:
            int r2 = android.graphics.Color.parseColor(r20)
            goto L4e3
        L4ce:
            int r2 = android.graphics.Color.parseColor(r21)
            goto L4e3
        L4d3:
            int r2 = android.graphics.Color.parseColor(r19)
            goto L4e3
        L4d8:
            int r2 = android.graphics.Color.parseColor(r18)
            goto L4e3
        L4dd:
            r2 = r3
            goto L4e3
        L4df:
            int r2 = android.graphics.Color.parseColor(r17)
        L4e3:
            r6.setColor(r2)
            r5.setColor(r2)
        L4e9:
            r2 = r37
            r5 = r38
            goto L518
        L4ee:
            boolean r2 = r1.l0
            if (r2 != 0) goto L503
            java.lang.String r2 = "#808A98"
            int r7 = android.graphics.Color.parseColor(r2)
            r6.setColor(r7)
            int r2 = android.graphics.Color.parseColor(r2)
            r5.setColor(r2)
            goto L4e9
        L503:
            j90 r2 = defpackage.j90.CLASSIC_WHITE
            if (r4 != r2) goto L50e
            java.lang.String r2 = "#0F172A"
        L509:
            int r2 = android.graphics.Color.parseColor(r2)
            goto L511
        L50e:
            java.lang.String r2 = "#F0F4F8"
            goto L509
        L511:
            r6.setColor(r2)
            r5.setColor(r2)
            goto L4e9
        L518:
            float r7 = java.lang.Math.min(r2, r5)
            r8 = 1056293519(0x3ef5c28f, float:0.48)
            float r7 = r7 * r8
            if (r35 != 0) goto L523
            goto L52b
        L523:
            int[] r3 = defpackage.v64.a
            int r9 = r35.ordinal()
            r3 = r3[r9]
        L52b:
            android.graphics.Paint r9 = r1.g0
            r10 = 1028443341(0x3d4ccccd, float:0.05)
            r11 = 1062836634(0x3f59999a, float:0.85)
            r12 = 1041865114(0x3e19999a, float:0.15)
            java.lang.String r13 = "#FF5252"
            r14 = 1043878380(0x3e3851ec, float:0.18)
            r15 = 1017370378(0x3ca3d70a, float:0.02)
            r17 = 1060320051(0x3f333333, float:0.7)
            r18 = r8
            r8 = 1077097267(0x40333333, float:2.8)
            r19 = 1051931443(0x3eb33333, float:0.35)
            r20 = 1046562734(0x3e6147ae, float:0.22)
            r21 = 1059481190(0x3f266666, float:0.65)
            switch(r3) {
                case 5: goto L8c3;
                case 6: goto L88b;
                case 7: goto L801;
                case 8: goto L7d4;
                case 9: goto L776;
                case 10: goto L72c;
                case 11: goto L6e5;
                case 12: goto L694;
                case 13: goto L643;
                case 14: goto L5f7;
                case 15: goto L5be;
                case 16: goto L574;
                default: goto L552;
            }
        L552:
            java.lang.String r3 = r1.getLabel()
            boolean r6 = defpackage.qs6.v0(r3)
            if (r6 == 0) goto L55e
            java.lang.String r3 = "BTN"
        L55e:
            float r5 = java.lang.Math.min(r2, r5)
            float r5 = r5 * r19
            float r6 = r2 - r28
            r2 = r1
            r1 = r0
            r0 = r2
            r7 = r4
            r2 = r25
            r4 = r3
            r3 = r31
            r0.b(r1, r2, r3, r4, r5, r6, r7)
            goto L3a4
        L574:
            r1 = r25
            r3 = r31
            r2 = 1035489772(0x3db851ec, float:0.09)
            float r2 = r2 * r7
            r4 = 1049582633(0x3e8f5c29, float:0.28)
            float r7 = r7 * r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r6)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            float r5 = r1 - r7
            r0.drawCircle(r5, r3, r2, r4)
            r0.drawCircle(r1, r3, r2, r4)
            float r5 = r1 + r7
            r0.drawCircle(r5, r3, r2, r4)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r6)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r4)
            r4 = 1075419546(0x4019999a, float:2.4)
            r2.setStrokeWidth(r4)
            android.graphics.RectF r4 = new android.graphics.RectF
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r5 = r5 * r7
            float r6 = r1 - r5
            float r7 = r7 * r21
            float r8 = r3 - r7
            float r1 = r1 + r5
            float r7 = r7 + r3
            r4.<init>(r6, r8, r1, r7)
            r1 = r24
            r0.drawRoundRect(r4, r1, r1, r2)
            goto L8fa
        L5be:
            r1 = r25
            r3 = r31
            android.graphics.Paint r2 = new android.graphics.Paint
            r4 = r26
            r2.<init>(r4)
            int r5 = r6.getColor()
            r2.setColor(r5)
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.CENTER
            r2.setTextAlign(r5)
            java.lang.String r5 = "sans-serif-medium"
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r5, r4)
            r2.setTypeface(r4)
            float r7 = r7 * r18
            r2.setTextSize(r7)
            float r4 = r2.descent()
            float r5 = r2.ascent()
            float r5 = r5 + r4
            float r5 = r5 / r16
            float r7 = r3 - r5
            java.lang.String r3 = "TR"
            r0.drawText(r3, r1, r7, r2)
            goto L8fa
        L5f7:
            r1 = r25
            r3 = r31
            float r33 = r33 * r7
            r2 = 1050924810(0x3ea3d70a, float:0.32)
            float r2 = r2 * r7
            r4 = 1039516303(0x3df5c28f, float:0.12)
            float r7 = r7 * r4
            android.graphics.RectF r4 = new android.graphics.RectF
            float r5 = r33 / r16
            float r9 = r1 - r5
            float r10 = r3 - r2
            float r7 = r7 / r16
            float r10 = r10 - r7
            float r5 = r5 + r1
            float r11 = r3 - r7
            r4.<init>(r9, r10, r5, r11)
            android.graphics.RectF r10 = new android.graphics.RectF
            float r11 = r3 + r7
            float r2 = r2 + r3
            float r2 = r2 + r7
            r10.<init>(r9, r11, r5, r2)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r2)
            r5.setStrokeWidth(r8)
            r2 = 1082130432(0x40800000, float:4.0)
            r0.drawRoundRect(r4, r2, r2, r5)
            r0.drawRoundRect(r10, r2, r2, r5)
            float r33 = r33 * r19
            float r6 = r1 - r33
            float r1 = r1 + r33
            r4 = r3
            r2 = r3
            r3 = r1
            r1 = r6
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L8fa
        L643:
            r1 = r25
            r9 = r31
            float r7 = r7 * r21
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r7 / r16
            float r4 = r1 - r3
            float r5 = r9 - r3
            float r10 = r1 + r3
            float r3 = r3 + r9
            r2.<init>(r4, r5, r10, r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r6)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r4)
            r3.setStrokeWidth(r8)
            r5 = 1082130432(0x40800000, float:4.0)
            r0.drawRoundRect(r2, r5, r5, r3)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            r5.setStyle(r4)
            r2 = r27
            r5.setStrokeWidth(r2)
            float r32 = r32 * r7
            float r2 = r9 - r32
            float r20 = r20 * r7
            float r4 = r9 + r20
            r3 = r1
            r0.drawLine(r1, r2, r3, r4, r5)
            r2 = r4
            float r3 = r1 - r20
            float r7 = r7 * r15
            float r4 = r7 + r9
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            float r3 = r1 + r20
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L8fa
        L694:
            r1 = r25
            r9 = r31
            float r7 = r7 * r21
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r7 / r16
            float r4 = r1 - r3
            float r5 = r9 - r3
            float r10 = r1 + r3
            float r3 = r3 + r9
            r2.<init>(r4, r5, r10, r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r6)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r4)
            r3.setStrokeWidth(r8)
            r5 = 1082130432(0x40800000, float:4.0)
            r0.drawRoundRect(r2, r5, r5, r3)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            r5.setStyle(r4)
            r2 = 1077936128(0x40400000, float:3.0)
            r5.setStrokeWidth(r2)
            float r32 = r32 * r7
            float r2 = r32 + r9
            float r20 = r20 * r7
            float r4 = r9 - r20
            r3 = r1
            r0.drawLine(r1, r2, r3, r4, r5)
            r2 = r4
            float r3 = r1 - r20
            float r7 = r7 * r15
            float r4 = r9 - r7
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            float r3 = r1 + r20
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L8fa
        L6e5:
            r10 = r1
            r11 = r25
            r9 = r31
            float r14 = r14 * r7
            r0.drawCircle(r11, r9, r14, r6)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r6)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            r1.setStrokeWidth(r8)
            r3 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r3 * r7
            r0.drawCircle(r11, r9, r3, r1)
            boolean r1 = r10.l0
            if (r1 != 0) goto L728
            android.graphics.Paint r5 = new android.graphics.Paint
            r4 = 1
            r5.<init>(r4)
            r5.setStyle(r2)
            r1 = r23
            r5.setStrokeWidth(r1)
            int r1 = android.graphics.Color.parseColor(r13)
            r5.setColor(r1)
            float r7 = r7 * r19
            float r1 = r11 - r7
            float r2 = r9 + r7
            float r3 = r11 + r7
            float r4 = r9 - r7
            r0.drawLine(r1, r2, r3, r4, r5)
        L728:
            r0 = r41
            goto L8fa
        L72c:
            r11 = r25
            r9 = r31
            float r21 = r21 * r7
            float r20 = r20 * r7
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            r2 = 1077936128(0x40400000, float:3.0)
            r5.setStrokeWidth(r2)
            float r1 = r11 - r20
            float r21 = r21 / r16
            float r2 = r9 + r21
            float r4 = r9 - r21
            r3 = r1
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            r6 = r2
            r2 = r4
            float r7 = r7 * r12
            float r3 = r1 - r7
            float r4 = r2 + r7
            r0.drawLine(r1, r2, r3, r4, r5)
            float r3 = r1 + r7
            r0.drawLine(r1, r2, r3, r4, r5)
            float r1 = r11 + r20
            r3 = r1
            r4 = r6
            r0.drawLine(r1, r2, r3, r4, r5)
            r2 = r4
            float r3 = r1 - r7
            float r4 = r2 - r7
            r0.drawLine(r1, r2, r3, r4, r5)
            float r3 = r1 + r7
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L8fa
        L776:
            r11 = r25
            r9 = r31
            r0 = 1052266988(0x3eb851ec, float:0.36)
            float r7 = r7 * r0
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            r1 = 1080033280(0x40600000, float:3.5)
            r5.setStrokeWidth(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            float r0 = r11 - r7
            float r2 = r9 - r7
            float r3 = r11 + r7
            float r4 = r9 + r7
            r1.<init>(r0, r2, r3, r4)
            r3 = 1133084672(0x43898000, float:275.0)
            r4 = 0
            r2 = 1110704128(0x42340000, float:45.0)
            r0 = r41
            r0.drawArc(r1, r2, r3, r4, r5)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r2 = r2 * r7
            float r3 = r11 + r2
            r4 = 1066192077(0x3f8ccccd, float:1.1)
            float r4 = r4 * r7
            float r4 = r9 - r4
            r1.moveTo(r3, r4)
            r3 = 1065772646(0x3f866666, float:1.05)
            float r3 = r3 * r7
            float r3 = r3 + r11
            float r2 = r9 - r2
            r1.lineTo(r3, r2)
            float r7 = r7 * r29
            float r2 = r11 + r7
            float r7 = r9 - r7
            r1.lineTo(r2, r7)
            r1.close()
            r0.drawPath(r1, r6)
            goto L8fa
        L7d4:
            r11 = r25
            r9 = r31
            float r20 = r20 * r7
            float r17 = r17 * r7
            float r7 = r7 * r14
            android.graphics.RectF r1 = new android.graphics.RectF
            float r7 = r7 / r16
            float r2 = r11 - r7
            float r3 = r2 - r20
            float r17 = r17 / r16
            float r4 = r9 - r17
            float r5 = r9 + r17
            r1.<init>(r3, r4, r2, r5)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r11 + r7
            float r7 = r3 + r20
            r2.<init>(r3, r4, r7, r5)
            r3 = 1080033280(0x40600000, float:3.5)
            r0.drawRoundRect(r1, r3, r3, r6)
            r0.drawRoundRect(r2, r3, r3, r6)
            goto L8fa
        L801:
            r10 = r1
            r3 = r23
            r11 = r25
            r9 = r31
            float r8 = r7 * r20
            float r1 = r7 * r18
            android.graphics.RectF r2 = new android.graphics.RectF
            float r4 = r11 - r8
            float r21 = r21 * r1
            float r5 = r9 - r21
            float r14 = r11 + r8
            float r12 = r12 * r1
            float r12 = r12 + r9
            r2.<init>(r4, r5, r14, r12)
            r0.drawRoundRect(r2, r8, r8, r6)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r6)
            r2 = 1077936128(0x40400000, float:3.0)
            r5.setStrokeWidth(r2)
            r2 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r4 = 1069966950(0x3fc66666, float:1.55)
            float r4 = r4 * r8
            float r12 = r11 - r4
            float r2 = r2 * r19
            float r14 = r9 - r2
            float r4 = r4 + r11
            float r15 = r9 + r2
            r1.<init>(r12, r14, r4, r15)
            r3 = 1127481344(0x43340000, float:180.0)
            r4 = 0
            r2 = 0
            r12 = r23
            r0.drawArc(r1, r2, r3, r4, r5)
            float r2 = r9 + r21
            r3 = r11
            r0 = r41
            r4 = r2
            r1 = r11
            r2 = r15
            r0.drawLine(r1, r2, r3, r4, r5)
            r25 = r1
            r2 = r4
            r0 = 1067030938(0x3f99999a, float:1.2)
            float r8 = r8 * r0
            float r1 = r25 - r8
            float r3 = r25 + r8
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            boolean r0 = r10.l0
            if (r0 != 0) goto L728
            android.graphics.Paint r5 = new android.graphics.Paint
            r4 = 1
            r5.<init>(r4)
            r5.setStyle(r6)
            r5.setStrokeWidth(r12)
            int r0 = android.graphics.Color.parseColor(r13)
            r5.setColor(r0)
            float r7 = r7 * r19
            float r1 = r25 - r7
            float r2 = r9 + r7
            float r3 = r25 + r7
            float r4 = r9 - r7
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L8fa
        L88b:
            r3 = r31
            float r7 = r7 / r16
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            float r11 = r11 * r7
            float r11 = r11 + r25
            float r17 = r17 * r7
            float r2 = r3 - r17
            r1.moveTo(r11, r2)
            float r10 = r10 * r7
            float r10 = r10 + r25
            r1.lineTo(r10, r3)
            float r4 = r3 + r17
            r1.lineTo(r11, r4)
            r1.close()
            r1.moveTo(r10, r2)
            float r7 = r7 * r33
            float r2 = r25 - r7
            r1.lineTo(r2, r3)
            r1.lineTo(r10, r4)
            r1.close()
            r0.drawPath(r1, r9)
            r0.drawPath(r1, r6)
            goto L8fa
        L8c3:
            r3 = r31
            float r7 = r7 / r16
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            float r11 = r11 * r7
            float r2 = r25 - r11
            float r17 = r17 * r7
            float r4 = r3 - r17
            r1.moveTo(r2, r4)
            float r10 = r10 * r7
            float r5 = r25 - r10
            r1.lineTo(r5, r3)
            float r8 = r3 + r17
            r1.lineTo(r2, r8)
            r1.close()
            r1.moveTo(r5, r4)
            float r7 = r7 * r33
            float r7 = r7 + r25
            r1.lineTo(r7, r3)
            r1.lineTo(r5, r8)
            r1.close()
            r0.drawPath(r1, r9)
            r0.drawPath(r1, r6)
        L8fa:
            r0.restore()
        L8fd:
            return
    }

    public final void setToggleState(boolean r2) {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 == r2) goto L9
            r1.l0 = r2
            r1.invalidate()
        L9:
            return
    }
}
