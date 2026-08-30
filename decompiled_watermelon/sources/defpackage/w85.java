package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.Set;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w85  reason: default package */
/* loaded from: classes.dex */
public final class w85 extends k11 {
    public Context R;
    public b81 X;
    public Intent Y;
    public VideoRenderer Z;
    public Set c0;
    public String d0;
    public File e0;
    public File f0;
    public String g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public long p0;
    public boolean q0;
    public /* synthetic */ Object r0;
    public final /* synthetic */ ReleaseStateCommandReceiver s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w85(ReleaseStateCommandReceiver releaseStateCommandReceiver, k11 k11Var) {
        super(k11Var);
        this.s0 = releaseStateCommandReceiver;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.r0 = obj;
        this.t0 |= Integer.MIN_VALUE;
        g11 g11Var = ReleaseStateCommandReceiver.a;
        return this.s0.e(null, null, null, this);
    }
}
