package me.magnum.melonds.ui.settings.fragments;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 extends hw6 implements eo2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ File Y;
    public final /* synthetic */ File Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1(File file, File file2, r41 r41Var) {
        super(2, r41Var);
        this.Y = file;
        this.Z = file2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 videoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 = new VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1(this.Y, this.Z, r41Var);
        videoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1.X = obj;
        return videoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        w61 w61Var = (w61) this.X;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        File file = this.Y;
        File file2 = this.Z;
        int i = 0;
        try {
            jc2.v0(file, file2);
            oc2 oc2Var = new oc2(new pc2(jc2.E0(file2, ic2.TOP_DOWN), true, new rk7(2)));
            int i2 = 0;
            while (oc2Var.hasNext()) {
                oc2Var.next();
                i2++;
                if (i2 < 0) {
                    hf.p0();
                    throw null;
                }
            }
            i = i2;
        } catch (Throwable unused) {
        }
        return new Integer(i);
    }
}
