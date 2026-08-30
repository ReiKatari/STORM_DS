package defpackage;

import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c61  reason: default package */
/* loaded from: classes.dex */
public final class c61 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ DSiWareManagerActivity B;

    public /* synthetic */ c61(DSiWareManagerActivity dSiWareManagerActivity, int i) {
        this.A = i;
        this.B = dSiWareManagerActivity;
    }

    @Override // defpackage.ki2
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
