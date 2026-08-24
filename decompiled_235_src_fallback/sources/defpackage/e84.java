package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e84  reason: default package */
/* loaded from: classes.dex */
public final class e84 implements android.hardware.SensorEventListener {
    public boolean A;
    public defpackage.c84 a;
    public float b;
    public float c;
    public boolean d;
    public boolean e;
    public final float f;
    public final float g;
    public final android.hardware.SensorManager h;
    public final android.hardware.Sensor i;
    public final android.hardware.Sensor j;
    public boolean k;
    public final float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public final int s;
    public final float[] t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public e84(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            c84 r0 = defpackage.c84.TOUCH_AIM
            r2.a = r0
            r0 = 1067450368(0x3fa00000, float:1.25)
            r2.b = r0
            r2.c = r0
            r0 = 1014350479(0x3c75c28f, float:0.015)
            r2.f = r0
            r0 = 1068708659(0x3fb33333, float:1.4)
            r2.g = r0
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            boolean r0 = r3 instanceof android.hardware.SensorManager
            r1 = 0
            if (r0 == 0) goto L25
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            goto L26
        L25:
            r3 = r1
        L26:
            r2.h = r3
            if (r3 == 0) goto L30
            r0 = 1
            android.hardware.Sensor r0 = r3.getDefaultSensor(r0)
            goto L31
        L30:
            r0 = r1
        L31:
            r2.i = r0
            if (r3 == 0) goto L3a
            r0 = 4
            android.hardware.Sensor r1 = r3.getDefaultSensor(r0)
        L3a:
            r2.j = r1
            r3 = 1059481190(0x3f266666, float:0.65)
            r2.l = r3
            r3 = 80
            r2.s = r3
            r3 = 3
            float[] r3 = new float[r3]
            r3 = {x0056: FILL_ARRAY_DATA  , data: [0, 0, 0} // fill-array
            r2.t = r3
            r3 = 1124073472(0x43000000, float:128.0)
            r2.u = r3
            r3 = 1119879168(0x42c00000, float:96.0)
            r2.v = r3
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent r15) {
            r14 = this;
            if (r15 != 0) goto L4
            goto L16e
        L4:
            android.hardware.Sensor r0 = r15.sensor
            int r0 = r0.getType()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L17b
            r4 = 4
            if (r0 == r4) goto L14
            goto L16e
        L14:
            float[] r15 = r15.values
            r15.getClass()
            r0 = r15[r2]
            r5 = r15[r3]
            r15 = r15[r1]
            int r6 = r14.r
            float r7 = r14.o
            r8 = 1017370378(0x3ca3d70a, float:0.02)
            r9 = 15
            if (r6 <= r9) goto L47
            float r0 = defpackage.i61.a(r0, r7, r8, r7)
            r14.o = r0
            float r0 = r14.p
            float r0 = defpackage.i61.a(r5, r0, r8, r0)
            r14.p = r0
            float r0 = r14.q
            float r15 = defpackage.i61.a(r15, r0, r8, r0)
            r14.q = r15
            int r15 = r14.s
            if (r6 <= r15) goto L16e
            r14.r = r15
            return
        L47:
            float r0 = r0 - r7
            float r6 = r14.p
            float r5 = r5 - r6
            float r6 = r14.q
            float r15 = r15 - r6
            float r6 = java.lang.Math.abs(r0)
            float r7 = r14.f
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            r9 = 0
            if (r6 >= 0) goto L5a
            r0 = r9
        L5a:
            float r6 = java.lang.Math.abs(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L63
            r5 = r9
        L63:
            java.lang.Math.abs(r15)
            float r15 = r14.l
            float r0 = r0 * r15
            r6 = 1065353216(0x3f800000, float:1.0)
            float r7 = r6 - r15
            float r10 = r14.m
            float r10 = r10 * r7
            float r10 = r10 + r0
            r14.m = r10
            float r15 = r15 * r5
            float r0 = r14.n
            float r7 = r7 * r0
            float r7 = r7 + r15
            r14.n = r7
            float r15 = java.lang.Math.signum(r10)
            float r0 = r14.m
            float r0 = java.lang.Math.abs(r0)
            double r10 = (double) r0
            float r0 = r14.g
            double r12 = (double) r0
            double r10 = java.lang.Math.pow(r10, r12)
            float r0 = (float) r10
            float r15 = r15 * r0
            float r0 = r14.b
            float r15 = r15 * r0
            r0 = 1094713344(0x41400000, float:12.0)
            float r15 = r15 * r0
            float r5 = r14.n
            float r5 = java.lang.Math.signum(r5)
            float r7 = r14.n
            float r7 = java.lang.Math.abs(r7)
            double r10 = (double) r7
            double r10 = java.lang.Math.pow(r10, r12)
            float r7 = (float) r10
            float r5 = r5 * r7
            float r7 = r14.c
            float r5 = r5 * r7
            float r5 = r5 * r0
            boolean r0 = r14.d
            if (r0 == 0) goto Lb0
            float r5 = -r5
        Lb0:
            boolean r0 = r14.e
            if (r0 == 0) goto Lb5
            float r15 = -r15
        Lb5:
            c84 r0 = r14.a
            int[] r7 = defpackage.d84.a
            int r0 = r0.ordinal()
            r0 = r7[r0]
            me.magnum.melonds.MelonEmulator r7 = me.magnum.melonds.MelonEmulator.a
            if (r0 == r3) goto L147
            if (r0 == r1) goto Le2
            r14 = 3
            if (r0 == r14) goto Ld0
            if (r0 != r4) goto Lcc
            goto L16e
        Lcc:
            defpackage.i.d()
            return
        Ld0:
            r14 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r14
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = defpackage.gi2.p(r5, r0, r6)
            float r15 = r15 / r14
            float r14 = defpackage.gi2.p(r15, r0, r6)
            r7.setSlot2AnalogInput(r1, r14)
            return
        Le2:
            r0 = -1080452710(0xffffffffbf99999a, float:-1.2)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto Leb
            r1 = r3
            goto Lec
        Leb:
            r1 = r2
        Lec:
            r4 = 1067030938(0x3f99999a, float:1.2)
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 <= 0) goto Lf5
            r5 = r3
            goto Lf6
        Lf5:
            r5 = r2
        Lf6:
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lfc
            r0 = r3
            goto Lfd
        Lfc:
            r0 = r2
        Lfd:
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 <= 0) goto L102
            r2 = r3
        L102:
            boolean r15 = r14.x
            if (r1 == r15) goto L113
            r14.x = r1
            b63 r15 = defpackage.b63.LEFT
            if (r1 == 0) goto L110
            r7.d(r15)
            goto L113
        L110:
            r7.e(r15)
        L113:
            boolean r15 = r14.y
            if (r5 == r15) goto L124
            r14.y = r5
            b63 r15 = defpackage.b63.RIGHT
            if (r5 == 0) goto L121
            r7.d(r15)
            goto L124
        L121:
            r7.e(r15)
        L124:
            boolean r15 = r14.z
            if (r0 == r15) goto L135
            r14.z = r0
            b63 r15 = defpackage.b63.UP
            if (r0 == 0) goto L132
            r7.d(r15)
            goto L135
        L132:
            r7.e(r15)
        L135:
            boolean r15 = r14.A
            if (r2 == r15) goto L16e
            r14.A = r2
            b63 r14 = defpackage.b63.DOWN
            if (r2 == 0) goto L143
            r7.d(r14)
            return
        L143:
            r7.e(r14)
            return
        L147:
            float r0 = r14.u
            float r0 = r0 - r5
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = defpackage.gi2.p(r0, r9, r1)
            r14.u = r0
            float r0 = r14.v
            float r0 = r0 - r15
            r1 = 1128202240(0x433f0000, float:191.0)
            float r0 = defpackage.gi2.p(r0, r9, r1)
            r14.v = r0
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L16f
            float r15 = java.lang.Math.abs(r15)
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 <= 0) goto L16e
            goto L16f
        L16e:
            return
        L16f:
            float r15 = r14.u
            int r15 = (int) r15
            float r0 = r14.v
            int r0 = (int) r0
            r7.onScreenTouch(r15, r0)
            r14.w = r3
            return
        L17b:
            float[] r15 = r15.values
            r15.getClass()
            r0 = r15[r2]
            r4 = r15[r3]
            r15 = r15[r1]
            float[] r5 = r14.t
            r6 = r5[r2]
            float r6 = r0 - r6
            float r6 = java.lang.Math.abs(r6)
            r7 = r5[r3]
            float r7 = r4 - r7
            float r7 = java.lang.Math.abs(r7)
            float r7 = r7 + r6
            r6 = r5[r1]
            float r6 = r15 - r6
            float r6 = java.lang.Math.abs(r6)
            float r6 = r6 + r7
            r7 = 1034147594(0x3da3d70a, float:0.08)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L1af
            int r6 = r14.r
            int r6 = r6 + r3
            r14.r = r6
            goto L1b1
        L1af:
            r14.r = r2
        L1b1:
            r5[r2] = r0
            r5[r3] = r4
            r5[r1] = r15
            return
    }
}
