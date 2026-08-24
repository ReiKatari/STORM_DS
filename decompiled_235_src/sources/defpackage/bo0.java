package defpackage;

import me.magnum.melonds.common.workers.CheatImportWorker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bo0  reason: default package */
/* loaded from: classes.dex */
public final class bo0 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ CheatImportWorker X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(CheatImportWorker cheatImportWorker, s41 s41Var) {
        super(s41Var);
        this.X = cheatImportWorker;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.h(null, null, null, this);
    }
}
