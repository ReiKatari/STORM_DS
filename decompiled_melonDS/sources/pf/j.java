package pf;

import android.content.Context;
import androidx.preference.Preference;
import cd.e1;
import cd.x0;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11628a;

    /* renamed from: b  reason: collision with root package name */
    public final cf.d f11629b;

    /* renamed from: c  reason: collision with root package name */
    public final s f11630c;

    /* renamed from: d  reason: collision with root package name */
    public final ae.a f11631d;

    /* renamed from: e  reason: collision with root package name */
    public final xf.a f11632e;

    /* renamed from: f  reason: collision with root package name */
    public final sd.h f11633f;

    /* renamed from: g  reason: collision with root package name */
    public final lf.c f11634g;

    /* renamed from: h  reason: collision with root package name */
    public final e1 f11635h;

    /* renamed from: i  reason: collision with root package name */
    public final x0 f11636i;

    /* renamed from: j  reason: collision with root package name */
    public final e1 f11637j;

    /* renamed from: k  reason: collision with root package name */
    public final EmulatorMessageQueue f11638k;

    public j(Context context, cf.d dVar, s sVar, ae.a aVar, xf.a aVar2, sd.h hVar, lf.c cVar) {
        this.f11628a = context;
        this.f11629b = dVar;
        this.f11630c = sVar;
        this.f11631d = aVar;
        this.f11632e = aVar2;
        this.f11633f = hVar;
        this.f11634g = cVar;
        e1 b10 = cd.q.b(0, Preference.DEFAULT_ORDER, null, 5);
        this.f11635h = b10;
        this.f11636i = new x0(b10);
        this.f11637j = cd.q.b(0, Preference.DEFAULT_ORDER, null, 4);
        this.f11638k = new EmulatorMessageQueue(new ah.e(10, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (r1 != r3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(me.magnum.melonds.domain.model.ConsoleType r34, ec.c r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            boolean r2 = r1 instanceof pf.b
            if (r2 == 0) goto L17
            r2 = r1
            pf.b r2 = (pf.b) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            pf.b r2 = new pf.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            dc.a r3 = dc.a.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L35
            if (r4 != r5) goto L2e
            p7.j.I(r1)
            goto L91
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            r1 = 0
            return r1
        L35:
            me.magnum.melonds.domain.model.ConsoleType r4 = r2.R
            p7.j.I(r1)
            r22 = r4
            goto L54
        L3d:
            p7.j.I(r1)
            r1 = r34
            r2.R = r1
            r2.Z = r6
            cf.d r4 = r0.f11629b
            kf.d2 r4 = (kf.d2) r4
            java.lang.Object r4 = r4.a(r2)
            if (r4 != r3) goto L51
            goto L90
        L51:
            r22 = r1
            r1 = r4
        L54:
            r6 = r1
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            r31 = 16744444(0xff7ffc, float:2.3463964E-38)
            r32 = 0
            r7 = 1
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r4 = 0
            r2.R = r4
            r2.Z = r5
            java.lang.Object r1 = r0.b(r1, r2)
            if (r1 != r3) goto L91
        L90:
            return r3
        L91:
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.j.a(me.magnum.melonds.domain.model.ConsoleType, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(me.magnum.melonds.domain.model.EmulatorConfiguration r33, ec.c r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            boolean r3 = r2 instanceof pf.c
            if (r3 == 0) goto L19
            r3 = r2
            pf.c r3 = (pf.c) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Z = r4
            goto L1e
        L19:
            pf.c r3 = new pf.c
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.X
            dc.a r4 = dc.a.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L30
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = r3.R
            p7.j.I(r2)
        L2e:
            r5 = r1
            goto L51
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            r1 = 0
            return r1
        L37:
            p7.j.I(r2)
            me.magnum.melonds.domain.model.MicSource r2 = r1.getMicSource()
            me.magnum.melonds.domain.model.MicSource r5 = me.magnum.melonds.domain.model.MicSource.DEVICE
            if (r2 != r5) goto L8a
            r3.R = r1
            r3.Z = r6
            sd.h r2 = r0.f11633f
            java.lang.String r5 = "android.permission.RECORD_AUDIO"
            java.lang.Object r2 = r2.a(r5, r3)
            if (r2 != r4) goto L2e
            return r4
        L51:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            if (r1 != 0) goto L89
            me.magnum.melonds.domain.model.MicSource r27 = me.magnum.melonds.domain.model.MicSource.NONE
            r30 = 14680063(0xdfffff, float:2.057115E-38)
            r31 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r1
        L89:
            return r5
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.j.b(me.magnum.melonds.domain.model.EmulatorConfiguration, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r4 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
        if (r1 != r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ze.a r36, ec.c r37) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.j.c(ze.a, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(me.magnum.melonds.domain.model.ConsoleType r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pf.h
            if (r0 == 0) goto L13
            r0 = r6
            pf.h r0 = (pf.h) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            pf.h r0 = new pf.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r6)
            goto L3a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r6)
            r0.Y = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L3a
            return r1
        L3a:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            me.magnum.melonds.MelonEmulator r5 = me.magnum.melonds.MelonEmulator.f9466a
            r5.updateEmulatorConfiguration(r6)
            yb.y r5 = yb.y.f14813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.j.d(me.magnum.melonds.domain.model.ConsoleType, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ze.a r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pf.i
            if (r0 == 0) goto L13
            r0 = r6
            pf.i r0 = (pf.i) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            pf.i r0 = new pf.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r6)
            goto L3a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r6)
            r0.Y = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L3a
            return r1
        L3a:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            me.magnum.melonds.MelonEmulator r5 = me.magnum.melonds.MelonEmulator.f9466a
            r5.updateEmulatorConfiguration(r6)
            yb.y r5 = yb.y.f14813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.j.e(ze.a, ec.c):java.lang.Object");
    }
}
