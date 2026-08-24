package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.Set;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: li5  reason: default package */
/* loaded from: classes.dex */
public final class li5 extends s41 {
    public Context R;
    public sb1 X;
    public Intent Y;
    public VideoRenderer Z;
    public Set d0;
    public String e0;
    public File f0;
    public File g0;
    public String h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public long q0;
    public boolean r0;
    public /* synthetic */ Object s0;
    public final /* synthetic */ ReleaseStateCommandReceiver t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li5(ReleaseStateCommandReceiver releaseStateCommandReceiver, s41 s41Var) {
        super(s41Var);
        this.t0 = releaseStateCommandReceiver;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        o41 o41Var = ReleaseStateCommandReceiver.a;
        return this.t0.e(null, null, null, this);
    }
}
