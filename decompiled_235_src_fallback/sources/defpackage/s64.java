package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s64  reason: default package */
/* loaded from: classes.dex */
public final class s64 extends android.view.View implements defpackage.r03 {
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
    public float j0;
    public float k0;
    public final java.util.LinkedHashMap l0;
    public final java.util.LinkedHashMap m0;
    public final java.util.LinkedHashSet n0;
    public final java.util.LinkedHashMap o0;
    public final android.os.Handler p0;

    public s64(android.content.Context r6) {
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
            java.lang.String r2 = "#26111318"
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
            r3 = 1082130432(0x40800000, float:4.0)
            r6.setStrokeWidth(r3)
            java.lang.String r4 = "#99FFFFFF"
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setColor(r4)
            r5.R = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r2)
            r6.setStrokeWidth(r3)
            java.lang.String r3 = "#99000000"
            int r3 = android.graphics.Color.parseColor(r3)
            r6.setColor(r3)
            r5.d0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            java.lang.String r3 = "#6600E5FF"
            int r3 = android.graphics.Color.parseColor(r3)
            r6.setColor(r3)
            r5.e0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r2)
            r2 = 1084227584(0x40a00000, float:5.0)
            r6.setStrokeWidth(r2)
            java.lang.String r2 = "#FF00E5FF"
            int r2 = android.graphics.Color.parseColor(r2)
            r6.setColor(r2)
            r5.f0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            java.lang.String r2 = "#F0F4F8"
            int r2 = android.graphics.Color.parseColor(r2)
            r6.setColor(r2)
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r6.setTextAlign(r2)
            java.lang.String r3 = "sans-serif-medium"
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r3, r0)
            r6.setTypeface(r4)
            r5.g0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            java.lang.String r4 = "#B3000000"
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setColor(r4)
            r6.setTextAlign(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r0)
            r6.setTypeface(r2)
            r5.h0 = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r6.setStyle(r1)
            java.lang.String r0 = "#59000000"
            int r0 = android.graphics.Color.parseColor(r0)
            r6.setColor(r0)
            r5.i0 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.j0 = r6
            r5.k0 = r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r5.l0 = r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r5.m0 = r6
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            r5.n0 = r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r5.o0 = r6
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r6.<init>(r0)
            r5.p0 = r6
            return
    }

    @Override // defpackage.r03
    public final void a(java.util.Set r13) {
            r12 = this;
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            b63 r3 = defpackage.b63.X
            b63 r4 = defpackage.b63.Y
            b63 r5 = defpackage.b63.B
            b63 r6 = defpackage.b63.A
            b63[] r3 = new defpackage.b63[]{r3, r4, r5, r6}
            java.util.List r3 = defpackage.hf.c0(r3)
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r3.next()
            b63 r4 = (defpackage.b63) r4
            boolean r5 = r13.contains(r4)
            java.util.LinkedHashMap r6 = r12.l0
            java.lang.Object r7 = r6.get(r4)
            java.lang.Float r7 = (java.lang.Float) r7
            if (r7 == 0) goto L3e
            float r7 = r7.floatValue()
            goto L3f
        L3e:
            r7 = r1
        L3f:
            r8 = 1064514355(0x3f733333, float:0.95)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            r8 = 0
            if (r7 >= 0) goto L49
            r7 = 1
            goto L4a
        L49:
            r7 = r8
        L4a:
            android.os.Handler r9 = r12.p0
            java.util.LinkedHashMap r10 = r12.o0
            java.util.LinkedHashMap r11 = r12.m0
            if (r5 == 0) goto L6f
            if (r7 != 0) goto L1f
            r5 = 1063339950(0x3f6147ae, float:0.88)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6.put(r4, r5)
            r11.put(r4, r2)
            q64 r5 = new q64
            r5.<init>(r8, r12, r4)
            r10.put(r4, r5)
            r6 = 3000(0xbb8, double:1.482E-320)
            r9.postDelayed(r5, r6)
            goto L1f
        L6f:
            java.util.LinkedHashSet r5 = r12.n0
            if (r7 == 0) goto L95
            java.lang.Object r7 = r10.remove(r4)
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            if (r7 == 0) goto L7e
            r9.removeCallbacks(r7)
        L7e:
            boolean r7 = r5.contains(r4)
            if (r7 == 0) goto L8e
            r5.remove(r4)
            r6.put(r4, r2)
            r11.put(r4, r0)
            goto L1f
        L8e:
            r6.put(r4, r2)
            r11.put(r4, r0)
            goto L1f
        L95:
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto La3
            r6.put(r4, r2)
            r11.put(r4, r2)
            goto L1f
        La3:
            r6.put(r4, r2)
            r11.put(r4, r0)
            goto L1f
        Lab:
            r12.invalidate()
            return
    }

    public final float getButtonInnerScale() {
            r0 = this;
            float r0 = r0.k0
            return r0
    }

    public final float getButtonSpread() {
            r0 = this;
            float r0 = r0.j0
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r50) {
            r49 = this;
            r0 = r49
            r1 = r50
            r1.getClass()
            super.onDraw(r50)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            r7 = 0
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lcf3
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 > 0) goto L1f
            goto Lcf3
        L1f:
            float r4 = java.lang.Math.min(r2, r3)
            r8 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r8
            float r3 = r3 / r8
            r5 = 1043542835(0x3e333333, float:0.175)
            float r5 = r5 * r4
            float r6 = r0.k0
            float r9 = r5 * r6
            r5 = 1049750405(0x3e91eb85, float:0.285)
            float r4 = r4 * r5
            float r5 = r0.j0
            float r4 = r4 * r5
            j90 r10 = defpackage.n90.a
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            float r6 = r3 - r4
            r11 = 1060320051(0x3f333333, float:0.7)
            float r11 = r11 * r9
            float r12 = r6 - r11
            r5.moveTo(r2, r12)
            float r12 = r2 + r4
            float r13 = r12 + r11
            r5.lineTo(r13, r3)
            float r13 = r3 + r4
            float r14 = r13 + r11
            r5.lineTo(r2, r14)
            float r14 = r2 - r4
            float r11 = r14 - r11
            r5.lineTo(r11, r3)
            r5.close()
            int[] r11 = defpackage.r64.a
            int r15 = r10.ordinal()
            r11 = r11[r15]
            java.lang.String r15 = "#6600D2FF"
            java.lang.String r16 = "#33FFFFFF"
            r17 = r7
            android.graphics.Paint r7 = r0.A
            android.graphics.Paint r8 = r0.B
            switch(r11) {
                case 1: goto L1a9;
                case 2: goto L196;
                case 3: goto L183;
                case 4: goto L170;
                case 5: goto L15d;
                case 6: goto L14a;
                case 7: goto L13b;
                case 8: goto L127;
                case 9: goto L113;
                case 10: goto Lff;
                case 11: goto Leb;
                case 12: goto Ld7;
                case 13: goto Lc3;
                case 14: goto Laf;
                case 15: goto L9b;
                case 16: goto L87;
                default: goto L75;
            }
        L75:
            java.lang.String r11 = "#26111318"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r16)
            r8.setColor(r11)
            goto L1bb
        L87:
            java.lang.String r11 = "#33004E64"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4D00A896"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L9b:
            java.lang.String r11 = "#33B8860B"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4DDAA520"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        Laf:
            java.lang.String r11 = "#334A69BD"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4D6A89CC"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        Lc3:
            java.lang.String r11 = "#338E8E93"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4D5856D6"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        Ld7:
            java.lang.String r11 = "#333C3B6E"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4D6C5CE7"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        Leb:
            java.lang.String r11 = "#40000000"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#66FF0033"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        Lff:
            java.lang.String r11 = "#26000000"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4DFFFFFF"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L113:
            java.lang.String r11 = "#330F172A"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4DFF3B30"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L127:
            java.lang.String r11 = "#331E222B"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4D38BDF8"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L13b:
            int r11 = android.graphics.Color.parseColor(r16)
            r7.setColor(r11)
            int r11 = android.graphics.Color.parseColor(r15)
            r8.setColor(r11)
            goto L1bb
        L14a:
            java.lang.String r11 = "#33052614"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4D00E676"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L15d:
            java.lang.String r11 = "#332A200B"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4DD4A017"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L170:
            java.lang.String r11 = "#331F1738"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4DC084FC"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L183:
            java.lang.String r11 = "#332D0608"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4DE50914"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L196:
            java.lang.String r11 = "#33475569"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4D94A3B8"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
            goto L1bb
        L1a9:
            java.lang.String r11 = "#33E2E8F0"
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setColor(r11)
            java.lang.String r11 = "#4DE2E8F0"
            int r11 = android.graphics.Color.parseColor(r11)
            r8.setColor(r11)
        L1bb:
            r1.save()
            r11 = 1082130432(0x40800000, float:4.0)
            r16 = r6
            r6 = 1073741824(0x40000000, float:2.0)
            r1.translate(r6, r11)
            android.graphics.Paint r11 = r0.i0
            r1.drawPath(r5, r11)
            r1.restore()
            r1.drawPath(r5, r7)
            r1.drawPath(r5, r8)
            r1.drawCircle(r2, r3, r4, r8)
            b63 r4 = defpackage.b63.X
            vr4 r5 = new vr4
            java.lang.Float r6 = java.lang.Float.valueOf(r2)
            java.lang.Float r7 = java.lang.Float.valueOf(r16)
            r5.<init>(r6, r7)
            vr4 r6 = new vr4
            r6.<init>(r4, r5)
            b63 r5 = defpackage.b63.Y
            vr4 r7 = new vr4
            java.lang.Float r8 = java.lang.Float.valueOf(r14)
            java.lang.Float r14 = java.lang.Float.valueOf(r3)
            r7.<init>(r8, r14)
            vr4 r8 = new vr4
            r8.<init>(r5, r7)
            b63 r7 = defpackage.b63.B
            vr4 r14 = new vr4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r14.<init>(r2, r13)
            vr4 r2 = new vr4
            r2.<init>(r7, r14)
            b63 r13 = defpackage.b63.A
            vr4 r14 = new vr4
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r14.<init>(r12, r3)
            vr4 r3 = new vr4
            r3.<init>(r13, r14)
            vr4[] r2 = new defpackage.vr4[]{r6, r8, r2, r3}
            java.util.Map r2 = defpackage.c14.m0(r2)
            vr4 r3 = new vr4
            java.lang.String r6 = "X"
            r3.<init>(r4, r6)
            vr4 r4 = new vr4
            java.lang.String r6 = "Y"
            r4.<init>(r5, r6)
            vr4 r5 = new vr4
            java.lang.String r6 = "B"
            r5.<init>(r7, r6)
            vr4 r6 = new vr4
            java.lang.String r7 = "A"
            r6.<init>(r13, r7)
            vr4[] r3 = new defpackage.vr4[]{r3, r4, r5, r6}
            java.util.Map r7 = defpackage.c14.m0(r3)
            r3 = 1064514355(0x3f733333, float:0.95)
            float r3 = r3 * r9
            android.graphics.Paint r8 = r0.g0
            r8.setTextSize(r3)
            android.graphics.Paint r12 = r0.h0
            r12.setTextSize(r3)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r13 = r2.iterator()
        L26a:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lcf3
            java.lang.Object r2 = r13.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r14 = r3
            b63 r14 = (defpackage.b63) r14
            java.lang.Object r2 = r2.getValue()
            vr4 r2 = (defpackage.vr4) r2
            java.lang.Object r3 = r2.A
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Object r2 = r2.B
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.util.LinkedHashMap r4 = r0.l0
            java.lang.Object r4 = r4.get(r14)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L2a2
            float r4 = r4.floatValue()
            goto L2a4
        L2a2:
            r4 = 1065353216(0x3f800000, float:1.0)
        L2a4:
            java.util.LinkedHashMap r5 = r0.m0
            java.lang.Object r5 = r5.get(r14)
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 == 0) goto L2b3
            float r5 = r5.floatValue()
            goto L2b5
        L2b3:
            r5 = r17
        L2b5:
            r1.save()
            r1.scale(r4, r4, r3, r2)
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 + r3
            r6 = 1042536202(0x3e23d70a, float:0.16)
            float r6 = r6 * r9
            float r6 = r6 + r2
            r18 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 + r18
            r16 = 1065772646(0x3f866666, float:1.05)
            r19 = r5
            float r5 = r9 * r16
            r1.drawCircle(r4, r6, r5, r11)
            int r16 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            r5 = 2
            r6 = 1
            if (r16 <= 0) goto L4e6
            int[] r20 = defpackage.r64.a
            int r21 = r10.ordinal()
            r20 = r20[r21]
            java.lang.String r21 = "#6638BDF8"
            java.lang.String r22 = "#6694A3B8"
            java.lang.String r23 = "#66FFD700"
            java.lang.String r24 = "#8038BDF8"
            java.lang.String r25 = "#80FB7185"
            switch(r20) {
                case 1: goto L4ce;
                case 2: goto L4c9;
                case 3: goto L4c2;
                case 4: goto L4bb;
                case 5: goto L4b6;
                case 6: goto L4af;
                case 7: goto L4aa;
                case 8: goto L4a5;
                case 9: goto L48a;
                case 10: goto L485;
                case 11: goto L47e;
                case 12: goto L45b;
                case 13: goto L453;
                case 14: goto L44b;
                case 15: goto L445;
                case 16: goto L43d;
                case 17: goto L40d;
                case 18: goto L3dd;
                case 19: goto L3b1;
                case 20: goto L381;
                case 21: goto L353;
                case 22: goto L325;
                case 23: goto L2f6;
                default: goto L2ec;
            }
        L2ec:
            java.lang.String r20 = "#6600E5FF"
            int r20 = android.graphics.Color.parseColor(r20)
            r4 = r20
            goto L4d2
        L2f6:
            int[] r20 = defpackage.r64.b
            int r21 = r14.ordinal()
            r4 = r20[r21]
            if (r4 == r6) goto L31d
            if (r4 == r5) goto L315
            r5 = 3
            if (r4 == r5) goto L30d
            java.lang.String r4 = "#80FB923C"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L30d:
            java.lang.String r4 = "#80EA580C"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L315:
            java.lang.String r4 = "#80F59E0B"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L31d:
            java.lang.String r4 = "#80D97706"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L325:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L34b
            r5 = 2
            if (r4 == r5) goto L343
            r5 = 3
            if (r4 == r5) goto L33b
            int r4 = android.graphics.Color.parseColor(r25)
            goto L4d2
        L33b:
            java.lang.String r4 = "#80C084FC"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L343:
            java.lang.String r4 = "#80F472B6"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L34b:
            java.lang.String r4 = "#80E11D48"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L353:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L379
            r5 = 2
            if (r4 == r5) goto L371
            r5 = 3
            if (r4 == r5) goto L369
            int r4 = android.graphics.Color.parseColor(r24)
            goto L4d2
        L369:
            java.lang.String r4 = "#8006B6D4"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L371:
            java.lang.String r4 = "#8014B8A6"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L379:
            java.lang.String r4 = "#800EA5E9"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L381:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L3a9
            r5 = 2
            if (r4 == r5) goto L3a1
            r5 = 3
            if (r4 == r5) goto L399
            java.lang.String r4 = "#80B026FF"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L399:
            java.lang.String r4 = "#8000F0FF"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L3a1:
            java.lang.String r4 = "#80FF003C"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L3a9:
            java.lang.String r4 = "#80FCEE0A"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L3b1:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L3d7
            r5 = 2
            if (r4 == r5) goto L3cf
            r5 = 3
            if (r4 == r5) goto L3c9
            java.lang.String r4 = "#80FCD34D"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L3c9:
            int r4 = android.graphics.Color.parseColor(r24)
            goto L4d2
        L3cf:
            java.lang.String r4 = "#8034D399"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L3d7:
            int r4 = android.graphics.Color.parseColor(r25)
            goto L4d2
        L3dd:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L405
            r5 = 2
            if (r4 == r5) goto L3fd
            r5 = 3
            if (r4 == r5) goto L3f5
            java.lang.String r4 = "#6610B981"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L3f5:
            java.lang.String r4 = "#66EF4444"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L3fd:
            java.lang.String r4 = "#66FBBF24"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L405:
            java.lang.String r4 = "#663B82F6"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L40d:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L435
            r5 = 2
            if (r4 == r5) goto L42d
            r5 = 3
            if (r4 == r5) goto L425
            java.lang.String r4 = "#6655EFC4"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L425:
            java.lang.String r4 = "#6674B9FF"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L42d:
            java.lang.String r4 = "#66FFEAA7"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L435:
            java.lang.String r4 = "#66FF7675"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L43d:
            java.lang.String r4 = "#6600D2D3"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L445:
            int r4 = android.graphics.Color.parseColor(r23)
            goto L4d2
        L44b:
            java.lang.String r4 = "#66706FD3"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L453:
            java.lang.String r4 = "#66C70039"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L45b:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L477
            r5 = 2
            if (r4 == r5) goto L470
            java.lang.String r4 = "#66A4B0BE"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L470:
            java.lang.String r4 = "#66D63031"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L477:
            java.lang.String r4 = "#6600B894"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L47e:
            java.lang.String r4 = "#80FF0033"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L485:
            int r4 = android.graphics.Color.parseColor(r22)
            goto L4d2
        L48a:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r6) goto L49e
            r5 = 2
            if (r4 == r5) goto L49e
            java.lang.String r4 = "#660AB9E6"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L49e:
            java.lang.String r4 = "#66FF3E3E"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L4a5:
            int r4 = android.graphics.Color.parseColor(r21)
            goto L4d2
        L4aa:
            int r4 = android.graphics.Color.parseColor(r15)
            goto L4d2
        L4af:
            java.lang.String r4 = "#6600E676"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L4b6:
            int r4 = android.graphics.Color.parseColor(r23)
            goto L4d2
        L4bb:
            java.lang.String r4 = "#66C084FC"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L4c2:
            java.lang.String r4 = "#66FF1744"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L4d2
        L4c9:
            int r4 = android.graphics.Color.parseColor(r22)
            goto L4d2
        L4ce:
            int r4 = android.graphics.Color.parseColor(r21)
        L4d2:
            android.graphics.Paint r5 = r0.e0
            r5.setColor(r4)
            r4 = 1128792064(0x43480000, float:200.0)
            float r4 = r4 * r19
            int r4 = (int) r4
            r5.setAlpha(r4)
            r4 = 1067030938(0x3f99999a, float:1.2)
            float r4 = r4 * r9
            r1.drawCircle(r3, r2, r4, r5)
        L4e6:
            int[] r19 = defpackage.r64.a
            int r4 = r10.ordinal()
            r4 = r19[r4]
            java.lang.String r21 = "#FF3E3E"
            java.lang.String r22 = "#0AB9E6"
            java.lang.String r5 = "#CBD5E1"
            java.lang.String r23 = "#00B894"
            java.lang.String r24 = "#D63031"
            java.lang.String r25 = "#F59E0B"
            java.lang.String r27 = "#1E3A8A"
            java.lang.String r28 = "#2563EB"
            java.lang.String r29 = "#78350F"
            java.lang.String r30 = "#7F1D1D"
            java.lang.String r31 = "#064E3B"
            java.lang.String r32 = "#FCEE0A"
            java.lang.String r33 = "#FB7185"
            java.lang.String r34 = "#E11D48"
            java.lang.String r35 = "#334155"
            java.lang.String r36 = "#FFFFFF"
            java.lang.String r37 = "#059669"
            java.lang.String r38 = "#D97706"
            java.lang.String r39 = "#DC2626"
            java.lang.String r40 = "#0284C7"
            java.lang.String r41 = "#0F172A"
            switch(r4) {
                case 1: goto La53;
                case 2: goto La3a;
                case 3: goto La21;
                case 4: goto La06;
                case 5: goto L9ed;
                case 6: goto L9d4;
                case 7: goto L9bb;
                case 8: goto L9a0;
                case 9: goto L962;
                case 10: goto L949;
                case 11: goto L92e;
                case 12: goto L8d3;
                case 13: goto L8b8;
                case 14: goto L89d;
                case 15: goto L882;
                case 16: goto L867;
                case 17: goto L7fa;
                case 18: goto L78d;
                case 19: goto L718;
                case 20: goto L69d;
                case 21: goto L622;
                case 22: goto L5a9;
                case 23: goto L534;
                default: goto L51b;
            }
        L51b:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r35)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r27 = android.graphics.Color.parseColor(r41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r27)
            r4.<init>(r5, r6)
        L530:
            r20 = 2
            goto La6a
        L534:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L591
            r5 = 2
            if (r4 == r5) goto L577
            r5 = 3
            if (r4 == r5) goto L55f
            vr4 r4 = new vr4
            java.lang.String r5 = "#FED7AA"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#EA580C"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L55f:
            vr4 r4 = new vr4
            java.lang.String r5 = "#FCA5A5"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r39)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L577:
            vr4 r4 = new vr4
            java.lang.String r5 = "#FCD34D"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#B45309"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L591:
            vr4 r4 = new vr4
            java.lang.String r5 = "#FDE68A"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L5a9:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L609
            r5 = 2
            if (r4 == r5) goto L5ee
            r5 = 3
            if (r4 == r5) goto L5d3
            vr4 r4 = new vr4
            java.lang.String r5 = "#FBCFE8"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r34)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L5d3:
            vr4 r4 = new vr4
            java.lang.String r5 = "#E879F9"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#A21CAF"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L5ee:
            vr4 r4 = new vr4
            java.lang.String r5 = "#F472B6"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#DB2777"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L609:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r33)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#BE123C"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L622:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L684
            r5 = 2
            if (r4 == r5) goto L669
            r5 = 3
            if (r4 == r5) goto L64e
            vr4 r4 = new vr4
            java.lang.String r5 = "#E0F2FE"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#0369A1"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L64e:
            vr4 r4 = new vr4
            java.lang.String r5 = "#A5F3FC"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#0891B2"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L669:
            vr4 r4 = new vr4
            java.lang.String r5 = "#99F6E4"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#0D9488"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L684:
            vr4 r4 = new vr4
            java.lang.String r5 = "#BAE6FD"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r40)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L69d:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L6ff
            r5 = 2
            if (r4 == r5) goto L6e4
            r5 = 3
            if (r4 == r5) goto L6c9
            vr4 r4 = new vr4
            java.lang.String r5 = "#B026FF"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#5A008A"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L6c9:
            vr4 r4 = new vr4
            java.lang.String r5 = "#00F0FF"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#007D85"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L6e4:
            vr4 r4 = new vr4
            java.lang.String r5 = "#FF003C"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#8A001F"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L6ff:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r32)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#857E02"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L718:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L774
            r5 = 2
            if (r4 == r5) goto L75b
            r5 = 3
            if (r4 == r5) goto L742
            vr4 r4 = new vr4
            java.lang.String r5 = "#FDE047"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L742:
            vr4 r4 = new vr4
            java.lang.String r5 = "#7DD3FC"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r40)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L75b:
            vr4 r4 = new vr4
            java.lang.String r5 = "#6EE7B7"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r37)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L774:
            vr4 r4 = new vr4
            java.lang.String r5 = "#FDA4AF"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r34)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L78d:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L7e3
            r5 = 2
            if (r4 == r5) goto L7cc
            r5 = 3
            if (r4 == r5) goto L7b5
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r37)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r31)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L7b5:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r39)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r30)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L7cc:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r29)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L7e3:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r28)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r27)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L7fa:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L850
            r5 = 2
            if (r4 == r5) goto L839
            r6 = 3
            if (r4 == r6) goto L822
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r37)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r26 = android.graphics.Color.parseColor(r31)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            r4.<init>(r5, r6)
            goto L530
        L822:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r28)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r27)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L839:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r25)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r29)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L850:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r39)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r30)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L867:
            vr4 r4 = new vr4
            java.lang.String r5 = "#00838F"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#004D40"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L882:
            vr4 r4 = new vr4
            java.lang.String r5 = "#8B0000"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#4A0000"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L89d:
            vr4 r4 = new vr4
            java.lang.String r5 = "#575FCF"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#2C2C54"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L8b8:
            vr4 r4 = new vr4
            java.lang.String r5 = "#801336"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#4A0E17"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L8d3:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L915
            r5 = 2
            if (r4 == r5) goto L8fc
            vr4 r4 = new vr4
            java.lang.String r5 = "#747D8C"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#2F3542"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L8fc:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r24)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#740E10"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L915:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r23)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#006266"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L92e:
            vr4 r4 = new vr4
            java.lang.String r5 = "#2B0008"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#0A0002"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L949:
            vr4 r4 = new vr4
            java.lang.String r6 = "#F8FAFC"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.<init>(r6, r5)
            goto L530
        L962:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r6 = 1
            if (r4 == r6) goto L987
            r5 = 2
            if (r4 == r5) goto L987
            vr4 r4 = new vr4
            int r20 = android.graphics.Color.parseColor(r22)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            int r20 = android.graphics.Color.parseColor(r40)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r4.<init>(r5, r6)
            goto L530
        L987:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r21)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#B91C1C"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L9a0:
            vr4 r4 = new vr4
            java.lang.String r5 = "#2C3240"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#151922"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L9bb:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r36)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#DDE3EA"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L9d4:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r37)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#022C22"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        L9ed:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#5C2B05"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        La06:
            vr4 r4 = new vr4
            java.lang.String r5 = "#9333EA"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#3B0764"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        La21:
            vr4 r4 = new vr4
            int r5 = android.graphics.Color.parseColor(r39)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "#5B090E"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        La3a:
            vr4 r4 = new vr4
            java.lang.String r5 = "#64748B"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = android.graphics.Color.parseColor(r35)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r5, r6)
            goto L530
        La53:
            r20 = 2
            vr4 r4 = new vr4
            int r6 = android.graphics.Color.parseColor(r36)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.<init>(r6, r5)
        La6a:
            java.lang.Object r5 = r4.A
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r4.B
            java.lang.Number r4 = (java.lang.Number) r4
            int r47 = r4.intValue()
            android.graphics.RadialGradient r42 = new android.graphics.RadialGradient
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r4 = r4 * r9
            float r43 = r3 - r4
            r4 = 1051931443(0x3eb33333, float:0.35)
            float r4 = r4 * r9
            float r44 = r2 - r4
            r4 = 1068289229(0x3faccccd, float:1.35)
            float r45 = r9 * r4
            if (r16 <= 0) goto La92
            r46 = r47
            goto La94
        La92:
            r46 = r5
        La94:
            android.graphics.Shader$TileMode r48 = android.graphics.Shader.TileMode.CLAMP
            r42.<init>(r43, r44, r45, r46, r47, r48)
            r4 = r42
            android.graphics.Paint r5 = r0.L
            r5.setShader(r4)
            r1.drawCircle(r3, r2, r9, r5)
            r4 = 0
            r5.setShader(r4)
            r4 = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            float r5 = r3 - r9
            float r6 = r4 - r9
            float r1 = r3 + r9
            r26 = r3
            float r3 = r4 + r9
            r2.<init>(r5, r6, r1, r3)
            r5 = 0
            android.graphics.Paint r6 = r0.R
            r3 = 1124532224(0x43070000, float:135.0)
            r1 = r4
            r4 = 1127481344(0x43340000, float:180.0)
            r27 = r10
            r20 = r11
            r10 = r26
            r11 = r1
            r26 = r13
            r13 = 1
            r1 = r50
            r1.drawArc(r2, r3, r4, r5, r6)
            android.graphics.Paint r6 = r0.d0
            r3 = -1036779520(0xffffffffc2340000, float:-45.0)
            r1.drawArc(r2, r3, r4, r5, r6)
            java.lang.String r2 = "#FF0033"
            java.lang.String r3 = "#FFD700"
            if (r16 <= 0) goto Lbfa
            int r4 = r27.ordinal()
            r4 = r19[r4]
            java.lang.String r5 = "#FF1744"
            java.lang.String r6 = "#FBBF24"
            java.lang.String r29 = "#38BDF8"
            switch(r4) {
                case 1: goto Lbee;
                case 2: goto Lbe7;
                case 3: goto Lbe2;
                case 4: goto Lbdb;
                case 5: goto Lbd6;
                case 6: goto Lbcf;
                case 7: goto Lbc8;
                case 8: goto Lbc3;
                case 9: goto Lbab;
                case 10: goto Lba6;
                case 11: goto Lba1;
                case 12: goto Lb82;
                case 13: goto Lb7a;
                case 14: goto Lb72;
                case 15: goto Lb6c;
                case 16: goto Lb64;
                case 17: goto Lb38;
                case 18: goto Lb0a;
                case 19: goto Lb04;
                case 20: goto Lafe;
                case 21: goto Laf8;
                case 22: goto Lb04;
                case 23: goto Laf2;
                default: goto Laea;
            }
        Laea:
            java.lang.String r4 = "#00E5FF"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Laf2:
            int r4 = android.graphics.Color.parseColor(r25)
            goto Lbf2
        Laf8:
            int r4 = android.graphics.Color.parseColor(r29)
            goto Lbf2
        Lafe:
            int r4 = android.graphics.Color.parseColor(r32)
            goto Lbf2
        Lb04:
            int r4 = android.graphics.Color.parseColor(r33)
            goto Lbf2
        Lb0a:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            if (r4 == r13) goto Lb30
            r5 = 2
            if (r4 == r5) goto Lb2a
            r5 = 3
            if (r4 == r5) goto Lb22
            java.lang.String r4 = "#10B981"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb22:
            java.lang.String r4 = "#EF4444"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb2a:
            int r4 = android.graphics.Color.parseColor(r6)
            goto Lbf2
        Lb30:
            java.lang.String r4 = "#3B82F6"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb38:
            int[] r4 = defpackage.r64.b
            int r21 = r14.ordinal()
            r4 = r4[r21]
            if (r4 == r13) goto Lb5e
            r13 = 2
            if (r4 == r13) goto Lb58
            r5 = 3
            if (r4 == r5) goto Lb50
            java.lang.String r4 = "#34D399"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb50:
            java.lang.String r4 = "#60A5FA"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb58:
            int r4 = android.graphics.Color.parseColor(r6)
            goto Lbf2
        Lb5e:
            int r4 = android.graphics.Color.parseColor(r5)
            goto Lbf2
        Lb64:
            java.lang.String r4 = "#00D2D3"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb6c:
            int r4 = android.graphics.Color.parseColor(r3)
            goto Lbf2
        Lb72:
            java.lang.String r4 = "#706FD3"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb7a:
            java.lang.String r4 = "#FF4081"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb82:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto Lb9c
            r5 = 2
            if (r4 == r5) goto Lb97
            java.lang.String r4 = "#A4B0BE"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lb97:
            int r4 = android.graphics.Color.parseColor(r24)
            goto Lbf2
        Lb9c:
            int r4 = android.graphics.Color.parseColor(r23)
            goto Lbf2
        Lba1:
            int r4 = android.graphics.Color.parseColor(r2)
            goto Lbf2
        Lba6:
            int r4 = android.graphics.Color.parseColor(r36)
            goto Lbf2
        Lbab:
            int[] r4 = defpackage.r64.b
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto Lbbe
            r5 = 2
            if (r4 == r5) goto Lbbe
            int r4 = android.graphics.Color.parseColor(r22)
            goto Lbf2
        Lbbe:
            int r4 = android.graphics.Color.parseColor(r21)
            goto Lbf2
        Lbc3:
            int r4 = android.graphics.Color.parseColor(r29)
            goto Lbf2
        Lbc8:
            java.lang.String r4 = "#00D2FF"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lbcf:
            java.lang.String r4 = "#00E676"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lbd6:
            int r4 = android.graphics.Color.parseColor(r3)
            goto Lbf2
        Lbdb:
            java.lang.String r4 = "#C084FC"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lbe2:
            int r4 = android.graphics.Color.parseColor(r5)
            goto Lbf2
        Lbe7:
            java.lang.String r4 = "#E2E8F0"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lbf2
        Lbee:
            int r4 = android.graphics.Color.parseColor(r40)
        Lbf2:
            android.graphics.Paint r5 = r0.f0
            r5.setColor(r4)
            r1.drawCircle(r10, r11, r9, r5)
        Lbfa:
            float r4 = r8.descent()
            float r5 = r8.ascent()
            float r5 = r5 + r4
            r18 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r18
            float r4 = r11 - r5
            java.lang.Object r5 = r7.get(r14)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = ""
            if (r5 != 0) goto Lc14
            r5 = r6
        Lc14:
            float r11 = r4 + r18
            r1.drawText(r5, r10, r11, r12)
            java.lang.String r5 = "#00FFFF"
            r11 = 7
            r22 = -1
            if (r16 <= 0) goto Lc7a
            int r16 = r27.ordinal()
            r13 = r19[r16]
            r0 = 1
            if (r13 == r0) goto Lc71
            if (r13 == r11) goto Lc71
            r11 = 10
            if (r13 == r11) goto Lc6c
            r11 = 11
            if (r13 == r11) goto Lc67
            switch(r13) {
                case 15: goto Lc62;
                case 16: goto Lc5d;
                case 17: goto Lc4d;
                case 18: goto Lc4d;
                case 19: goto Lc48;
                case 20: goto Lc39;
                case 21: goto Lc48;
                case 22: goto Lc48;
                case 23: goto Lc48;
                default: goto Lc36;
            }
        Lc36:
            r0 = r22
            goto Lc76
        Lc39:
            int[] r2 = defpackage.r64.b
            int r3 = r14.ordinal()
            r2 = r2[r3]
            if (r2 != r0) goto Lc36
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc36
        Lc48:
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc36
        Lc4d:
            int[] r0 = defpackage.r64.b
            int r2 = r14.ordinal()
            r0 = r0[r2]
            r5 = 2
            if (r0 != r5) goto Lc36
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc36
        Lc5d:
            int r22 = android.graphics.Color.parseColor(r5)
            goto Lc36
        Lc62:
            int r22 = android.graphics.Color.parseColor(r3)
            goto Lc36
        Lc67:
            int r22 = android.graphics.Color.parseColor(r2)
            goto Lc36
        Lc6c:
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc36
        Lc71:
            int r22 = android.graphics.Color.parseColor(r40)
            goto Lc36
        Lc76:
            r8.setColor(r0)
            goto Lcd9
        Lc7a:
            int r0 = r27.ordinal()
            r0 = r19[r0]
            r13 = 1
            if (r0 == r13) goto Lcd1
            if (r0 == r11) goto Lcd1
            r11 = 13
            if (r0 == r11) goto Lcca
            r11 = 10
            if (r0 == r11) goto Lcd1
            r11 = 11
            if (r0 == r11) goto Lcc5
            switch(r0) {
                case 15: goto Lcc0;
                case 16: goto Lcbb;
                case 17: goto Lcab;
                case 18: goto Lcab;
                case 19: goto Lca6;
                case 20: goto Lc97;
                case 21: goto Lca6;
                case 22: goto Lca6;
                case 23: goto Lca6;
                default: goto Lc94;
            }
        Lc94:
            r0 = r22
            goto Lcd6
        Lc97:
            int[] r0 = defpackage.r64.b
            int r2 = r14.ordinal()
            r0 = r0[r2]
            if (r0 != r13) goto Lc94
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc94
        Lca6:
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc94
        Lcab:
            int[] r0 = defpackage.r64.b
            int r2 = r14.ordinal()
            r0 = r0[r2]
            r5 = 2
            if (r0 != r5) goto Lc94
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc94
        Lcbb:
            int r22 = android.graphics.Color.parseColor(r5)
            goto Lc94
        Lcc0:
            int r22 = android.graphics.Color.parseColor(r3)
            goto Lc94
        Lcc5:
            int r22 = android.graphics.Color.parseColor(r2)
            goto Lc94
        Lcca:
            java.lang.String r0 = "#F2C9D8"
            int r22 = android.graphics.Color.parseColor(r0)
            goto Lc94
        Lcd1:
            int r22 = android.graphics.Color.parseColor(r41)
            goto Lc94
        Lcd6:
            r8.setColor(r0)
        Lcd9:
            java.lang.Object r0 = r7.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lce2
            goto Lce3
        Lce2:
            r6 = r0
        Lce3:
            r1.drawText(r6, r10, r4, r8)
            r1.restore()
            r0 = r49
            r11 = r20
            r13 = r26
            r10 = r27
            goto L26a
        Lcf3:
            return
    }

    public final void setButtonInnerScale(float r3) {
            r2 = this;
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1 = 1068708659(0x3fb33333, float:1.4)
            float r3 = defpackage.gi2.p(r3, r0, r1)
            r2.k0 = r3
            r2.invalidate()
            return
    }

    public final void setButtonSpread(float r3) {
            r2 = this;
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1 = 1070386381(0x3fcccccd, float:1.6)
            float r3 = defpackage.gi2.p(r3, r0, r1)
            r2.j0 = r3
            r2.invalidate()
            return
    }
}
