package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mc  reason: default package */
/* loaded from: classes.dex */
public final class mc extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc(Object obj, Object obj2, Object obj3, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = obj3;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        Object obj2 = this.c0;
        o27 o27Var = o27.a;
        Object obj3 = this.d0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                cj2 cj2Var = (cj2) obj3;
                return new mc((pc) obj4, this.c0, cj2Var, (j11) obj, 0).v(o27Var);
            case 1:
                return new mc((hv1) obj4, (RARuntimeBridgeConfig) obj2, (jm4) obj3, (j11) obj, 1).v(o27Var);
            case 2:
                return new mc((dk4) obj4, (pw6) obj2, (aj2) obj3, (j11) obj, 2).v(o27Var);
            case 3:
                return new mc((ReleaseStateCommandReceiver) obj4, (Context) obj2, (Intent) obj3, (j11) obj, 3).v(o27Var);
            case 4:
                return new mc((t47) obj4, (m47) obj2, (List) obj3, (j11) obj, 4).v(o27Var);
            default:
                return new mc((t47) obj4, (cb0) obj2, (Map) obj3, (j11) obj, 5).v(o27Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0398, code lost:
        if (r2.equals("software") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03ad, code lost:
        if (r2.equals("soft") != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03af, code lost:
        r2 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03b8, code lost:
        if (r2.equals("vk") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c1, code lost:
        if (r2.equals("gl") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03ca, code lost:
        if (r2.equals("vulkan") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03cd, code lost:
        r2 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03d6, code lost:
        if (r2.equals("opengl") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03da, code lost:
        r2 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0575, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x09cb, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x09e1, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0a3b, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0a51, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0a67, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0a7d, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0a93, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0b64, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0b7a, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0b90, code lost:
        if (r0 == defpackage.p31.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e6, code lost:
        if (r0.equals("enabled") == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 3252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc.v(java.lang.Object):java.lang.Object");
    }
}
