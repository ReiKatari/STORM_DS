package defpackage;

import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q91  reason: default package */
/* loaded from: classes.dex */
public final class q91 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ DSiWareManagerActivity B;

    public /* synthetic */ q91(DSiWareManagerActivity dSiWareManagerActivity, int i) {
        this.A = i;
        this.B = dSiWareManagerActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        DSiWareManagerActivity dSiWareManagerActivity = this.B;
        switch (i) {
            case 0:
                return dSiWareManagerActivity.getDefaultViewModelProviderFactory();
            case 1:
                return dSiWareManagerActivity.getViewModelStore();
            default:
                return dSiWareManagerActivity.getDefaultViewModelCreationExtras();
        }
    }
}
