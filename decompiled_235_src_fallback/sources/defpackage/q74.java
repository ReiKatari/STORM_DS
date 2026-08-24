package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q74  reason: default package */
/* loaded from: classes.dex */
public final class q74 {
    public long a;
    public final android.util.SparseLongArray b;
    public final android.util.SparseBooleanArray c;
    public final java.util.ArrayList d;
    public final defpackage.hz3 e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public defpackage.jk4 j;

    public q74() {
            r2 = this;
            r2.<init>()
            android.util.SparseLongArray r0 = new android.util.SparseLongArray
            r0.<init>()
            r2.b = r0
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            r2.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.d = r0
            hz3 r0 = new hz3
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            r0 = -1
            r2.f = r0
            r2.g = r0
            return
    }

    public final void a(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            android.util.SparseLongArray r3 = r7.b
            if (r0 == 0) goto L26
            r4 = 5
            if (r0 == r4) goto L26
            r4 = 9
            if (r0 == r4) goto L12
            goto L49
        L12:
            r0 = 0
            int r8 = r8.getPointerId(r0)
            int r0 = r3.indexOfKey(r8)
            if (r0 >= 0) goto L49
            long r4 = r7.a
            long r1 = r1 + r4
            r7.a = r1
            r3.put(r8, r4)
            return
        L26:
            int r0 = r8.getActionIndex()
            int r4 = r8.getPointerId(r0)
            int r5 = r3.indexOfKey(r4)
            if (r5 >= 0) goto L49
            long r5 = r7.a
            long r1 = r1 + r5
            r7.a = r1
            r3.put(r4, r5)
            int r8 = r8.getToolType(r0)
            r0 = 3
            if (r8 != r0) goto L49
            android.util.SparseBooleanArray r7 = r7.c
            r8 = 1
            r7.put(r4, r8)
        L49:
            return
    }

    public final void b(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getPointerCount()
            r1 = 1
            if (r0 == r1) goto L8
            goto L1a
        L8:
            r0 = 0
            int r0 = r3.getToolType(r0)
            int r3 = r3.getSource()
            int r1 = r2.f
            if (r0 != r1) goto L1b
            int r1 = r2.g
            if (r3 == r1) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            r2.f = r0
            r2.g = r3
            android.util.SparseBooleanArray r3 = r2.c
            r3.clear()
            android.util.SparseLongArray r2 = r2.b
            r2.clear()
            return
    }

    public final defpackage.ap3 c(android.view.MotionEvent r15, defpackage.te r16) {
            r14 = this;
            int r0 = r15.getActionMasked()
            r6 = 0
            android.util.SparseBooleanArray r1 = r14.c
            r7 = 0
            r3 = 3
            if (r0 == r3) goto L10d
            r4 = 4
            if (r0 == r4) goto L10d
            r14.b(r15)
            r14.a(r15)
            r4 = 9
            r8 = 1
            if (r0 == r4) goto L23
            r4 = 7
            if (r0 == r4) goto L23
            r4 = 10
            if (r0 != r4) goto L21
            goto L23
        L21:
            r9 = r7
            goto L24
        L23:
            r9 = r8
        L24:
            r4 = 8
            if (r0 != r4) goto L2a
            r10 = r8
            goto L2b
        L2a:
            r10 = r7
        L2b:
            if (r9 == 0) goto L38
            int r4 = r15.getActionIndex()
            int r4 = r15.getPointerId(r4)
            r1.put(r4, r8)
        L38:
            if (r0 == r8) goto L45
            r1 = 6
            if (r0 == r1) goto L40
            r0 = -1
        L3e:
            r11 = r0
            goto L46
        L40:
            int r0 = r15.getActionIndex()
            goto L3e
        L45:
            r11 = r7
        L46:
            java.util.ArrayList r12 = r14.d
            r12.clear()
            int r0 = r15.getActionMasked()
            r1 = 34
            if (r0 != 0) goto L87
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L66
            int r0 = defpackage.au2.d(r15)
            if (r0 == r3) goto L64
            int r0 = defpackage.au2.d(r15)
            r4 = 5
            if (r0 != r4) goto L66
        L64:
            r0 = r8
            goto L67
        L66:
            r0 = r7
        L67:
            int r4 = r15.getButtonState()
            if (r4 != 0) goto L80
            r4 = 8194(0x2002, float:1.1482E-41)
            boolean r4 = r15.isFromSource(r4)
            if (r4 != 0) goto L7e
            r4 = 1048584(0x100008, float:1.469379E-39)
            boolean r4 = r15.isFromSource(r4)
            if (r4 == 0) goto L80
        L7e:
            r4 = r8
            goto L81
        L80:
            r4 = r7
        L81:
            if (r0 != 0) goto L85
            if (r4 == 0) goto L87
        L85:
            r14.h = r8
        L87:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto Lcc
            int r0 = defpackage.au2.d(r15)
            if (r0 != r3) goto Lcc
            r14.i = r8
            int r0 = r15.getActionMasked()
            if (r0 != 0) goto Lbc
            float r0 = defpackage.au2.a(r15)
            float r1 = defpackage.au2.n(r15)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r3 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            r5 = 32
            long r3 = r3 << r5
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r9
            long r0 = r0 | r3
            jk4 r3 = new jk4
            r3.<init>(r0)
            r14.j = r3
        Lbc:
            jk4 r3 = r14.j
            r4 = 0
            r5 = 0
            r0 = r14
            r2 = r15
            r1 = r16
            xy4 r1 = r0.d(r1, r2, r3, r4, r5)
            r12.add(r1)
            goto Lf3
        Lcc:
            r14.i = r7
            int r13 = r15.getPointerCount()
            r4 = r7
        Ld3:
            if (r4 >= r13) goto Lf3
            if (r9 != 0) goto Le3
            if (r4 == r11) goto Le3
            if (r10 == 0) goto Le1
            int r1 = r15.getButtonState()
            if (r1 == 0) goto Le3
        Le1:
            r5 = r8
            goto Le4
        Le3:
            r5 = r7
        Le4:
            r3 = 0
            r0 = r14
            r2 = r15
            r1 = r16
            xy4 r3 = r0.d(r1, r2, r3, r4, r5)
            r12.add(r3)
            int r4 = r4 + 1
            goto Ld3
        Lf3:
            int r1 = r15.getActionMasked()
            if (r1 != r8) goto Lff
            r14.h = r7
            r14.i = r7
            r14.j = r6
        Lff:
            r14.e(r15)
            ap3 r14 = new ap3
            r15.getEventTime()
            r0 = 15
            r14.<init>(r0, r12, r15)
            return r14
        L10d:
            android.util.SparseLongArray r2 = r14.b
            r2.clear()
            r1.clear()
            r14.h = r7
            r14.i = r7
            r14.j = r6
            return r6
    }

    public final defpackage.xy4 d(defpackage.te r43, android.view.MotionEvent r44, defpackage.jk4 r45, int r46, boolean r47) {
            r42 = this;
            r0 = r42
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            int r5 = r2.getPointerId(r4)
            android.util.SparseLongArray r6 = r0.b
            int r7 = r6.indexOfKey(r5)
            if (r7 < 0) goto L1c
            long r5 = r6.valueAt(r7)
            r12 = r5
            goto L27
        L1c:
            long r7 = r0.a
            r9 = 1
            long r9 = r9 + r7
            r0.a = r9
            r6.put(r5, r7)
            r12 = r7
        L27:
            float r21 = r2.getPressure(r4)
            float r5 = r2.getX(r4)
            float r6 = r2.getY(r4)
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r7 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            r9 = 32
            long r7 = r7 << r9
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r10
            long r5 = r5 | r7
            r7 = 29
            if (r4 != 0) goto L73
            if (r3 == 0) goto L53
            long r14 = r3.a
            r8 = r9
            r16 = r10
            goto L6c
        L53:
            float r3 = r2.getRawX()
            float r8 = r2.getRawY()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r14 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r8)
            r8 = r9
            r16 = r10
            long r9 = (long) r3
            long r14 = r14 << r8
            long r9 = r9 & r16
            long r14 = r14 | r9
        L6c:
            long r9 = r1.D(r14)
        L70:
            r18 = r9
            goto La3
        L73:
            r8 = r9
            r16 = r10
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r7) goto L9d
            if (r3 == 0) goto L80
            long r9 = r3.a
        L7e:
            r14 = r9
            goto L98
        L80:
            float r3 = defpackage.au2.b(r2, r4)
            float r9 = defpackage.au2.o(r2, r4)
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r10 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r9)
            long r14 = (long) r3
            long r9 = r10 << r8
            long r14 = r14 & r16
            long r9 = r9 | r14
            goto L7e
        L98:
            long r9 = r1.D(r14)
            goto L70
        L9d:
            long r14 = r1.r(r5)
            r18 = r5
        La3:
            int r1 = r2.getToolType(r4)
            r9 = 3
            if (r1 == 0) goto Lb5
            r10 = 2
            r11 = 1
            if (r1 == r11) goto Lbe
            if (r1 == r10) goto Lbb
            if (r1 == r9) goto Lb8
            r10 = 4
            if (r1 == r10) goto Lb8
        Lb5:
            r22 = 0
            goto Lda
        Lb8:
            r22 = r10
            goto Lda
        Lbb:
            r22 = r9
            goto Lda
        Lbe:
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r1 = r2.isFromSource(r1)
            if (r1 != 0) goto Lcf
            r1 = 1048584(0x100008, float:1.469379E-39)
            boolean r1 = r2.isFromSource(r1)
            if (r1 == 0) goto Ld8
        Lcf:
            boolean r1 = r0.h
            if (r1 == 0) goto Lb8
            boolean r1 = r0.i
            if (r1 == 0) goto Ld8
            goto Lb8
        Ld8:
            r22 = r11
        Lda:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r10 = r2.getHistorySize()
            r1.<init>(r10)
            int r10 = r2.getHistorySize()
            r20 = r8
            r11 = 0
        Lea:
            r23 = 0
            r24 = 0
            r26 = 1065353216(0x3f800000, float:1.0)
            r27 = 0
            if (r11 >= r10) goto L182
            float r28 = r2.getHistoricalX(r4, r11)
            float r29 = r2.getHistoricalY(r4, r11)
            int r30 = java.lang.Float.floatToRawIntBits(r28)
            r31 = 2147483647(0x7fffffff, float:NaN)
            r3 = r30 & r31
            r9 = 2139095040(0x7f800000, float:Infinity)
            if (r3 >= r9) goto L177
            int r3 = java.lang.Float.floatToRawIntBits(r29)
            r3 = r3 & r31
            if (r3 >= r9) goto L177
            int r3 = java.lang.Float.floatToRawIntBits(r28)
            long r7 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r29)
            r29 = r10
            long r9 = (long) r3
            long r7 = r7 << r20
            long r9 = r9 & r16
            long r35 = r7 | r9
            long r33 = r2.getHistoricalEventTime(r11)
            r3 = 52
            float r3 = r2.getHistoricalAxisValue(r3, r4, r11)
            java.lang.Float r7 = java.lang.Float.valueOf(r3)
            int r3 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r3 <= 0) goto L137
            r23 = r7
        L137:
            if (r23 == 0) goto L13d
            float r26 = r23.floatValue()
        L13d:
            r37 = r26
            int r3 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r3 < r9) goto L168
            int r3 = defpackage.au2.d(r2)
            r7 = 3
            if (r3 != r7) goto L168
            r3 = 50
            float r3 = r2.getHistoricalAxisValue(r3, r4, r11)
            r7 = 51
            float r7 = r2.getHistoricalAxisValue(r7, r4, r11)
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r9 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r3
            long r9 = r9 << r20
            long r7 = r7 & r16
            long r24 = r9 | r7
        L168:
            r38 = r24
            vx2 r32 = new vx2
            r40 = r35
            r32.<init>(r33, r35, r37, r38, r40)
            r3 = r32
            r1.add(r3)
            goto L179
        L177:
            r29 = r10
        L179:
            int r11 = r11 + 1
            r10 = r29
            r7 = 29
            r9 = 3
            goto Lea
        L182:
            int r3 = r2.getActionMasked()
            r7 = 8
            if (r3 != r7) goto L1a9
            r3 = 10
            float r3 = r2.getAxisValue(r3)
            r7 = 9
            float r7 = r2.getAxisValue(r7)
            float r7 = -r7
            float r7 = r7 + r27
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r8 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r3
            long r7 = r8 << r20
            long r9 = r10 & r16
            long r7 = r7 | r9
            goto L1ab
        L1a9:
            r7 = r24
        L1ab:
            int r3 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r3 < r9) goto L1ce
            int r10 = defpackage.au2.d(r2)
            r11 = 5
            if (r10 != r11) goto L1ce
            r10 = 52
            float r10 = r2.getAxisValue(r10, r4)
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            int r10 = (r10 > r27 ? 1 : (r10 == r27 ? 0 : -1))
            if (r10 <= 0) goto L1c8
            r23 = r11
        L1c8:
            if (r23 == 0) goto L1ce
            float r26 = r23.floatValue()
        L1ce:
            r27 = r26
            r9 = 29
            if (r3 < r9) goto L1fc
            int r3 = defpackage.au2.d(r2)
            r9 = 3
            if (r3 != r9) goto L1fc
            r3 = 50
            float r3 = r2.getAxisValue(r3, r4)
            r9 = 51
            float r9 = r2.getAxisValue(r9, r4)
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r10 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r9)
            r30 = r5
            long r5 = (long) r3
            long r9 = r10 << r20
            long r5 = r5 & r16
            long r24 = r9 | r5
        L1f9:
            r28 = r24
            goto L1ff
        L1fc:
            r30 = r5
            goto L1f9
        L1ff:
            android.util.SparseBooleanArray r0 = r0.c
            int r3 = r2.getPointerId(r4)
            r4 = 0
            boolean r23 = r0.get(r3, r4)
            xy4 r11 = new xy4
            long r2 = r2.getEventTime()
            r20 = r47
            r24 = r1
            r25 = r7
            r16 = r14
            r14 = r2
            r11.<init>(r12, r14, r16, r18, r20, r21, r22, r23, r24, r25, r27, r28, r30)
            return r11
    }

    public final void e(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            android.util.SparseBooleanArray r2 = r7.c
            android.util.SparseLongArray r7 = r7.b
            r3 = 1
            if (r0 == r3) goto L10
            r4 = 6
            if (r0 == r4) goto L10
            goto L24
        L10:
            int r0 = r8.getActionIndex()
            int r0 = r8.getPointerId(r0)
            boolean r4 = r2.get(r0, r1)
            if (r4 != 0) goto L24
            r7.delete(r0)
            r2.delete(r0)
        L24:
            int r0 = r7.size()
            int r4 = r8.getPointerCount()
            if (r0 <= r4) goto L54
            int r0 = r7.size()
            int r0 = r0 - r3
        L33:
            r3 = -1
            if (r3 >= r0) goto L54
            int r3 = r7.keyAt(r0)
            int r4 = r8.getPointerCount()
            r5 = r1
        L3f:
            if (r5 >= r4) goto L4b
            int r6 = r8.getPointerId(r5)
            if (r6 != r3) goto L48
            goto L51
        L48:
            int r5 = r5 + 1
            goto L3f
        L4b:
            r7.removeAt(r0)
            r2.delete(r3)
        L51:
            int r0 = r0 + (-1)
            goto L33
        L54:
            return
    }
}
