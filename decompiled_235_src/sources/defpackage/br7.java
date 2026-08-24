package defpackage;

import me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br7  reason: default package */
/* loaded from: classes.dex */
public final class br7 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ VulkanDriverManagerActivity B;

    public /* synthetic */ br7(VulkanDriverManagerActivity vulkanDriverManagerActivity, int i) {
        this.A = i;
        this.B = vulkanDriverManagerActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        VulkanDriverManagerActivity vulkanDriverManagerActivity = this.B;
        switch (i) {
            case 0:
                return vulkanDriverManagerActivity.getDefaultViewModelProviderFactory();
            case 1:
                return vulkanDriverManagerActivity.getViewModelStore();
            default:
                return vulkanDriverManagerActivity.getDefaultViewModelCreationExtras();
        }
    }
}
