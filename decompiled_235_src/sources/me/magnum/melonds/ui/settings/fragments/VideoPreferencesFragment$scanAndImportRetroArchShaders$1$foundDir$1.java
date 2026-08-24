package me.magnum.melonds.ui.settings.fragments;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1 extends hw6 implements eo2 {
    public final /* synthetic */ List X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1(List list, r41 r41Var) {
        super(2, r41Var);
        this.X = list;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1(this.X, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        List<String> list = this.X;
        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
        for (String str : list) {
            arrayList.add(new File(str));
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            File file = (File) obj2;
            if (file.exists() && file.isDirectory()) {
                hc2 E0 = jc2.E0(file, ic2.TOP_DOWN);
                fc2 fc2Var = new fc2(new hc2(E0.a, E0.b, null, 3));
                while (fc2Var.hasNext()) {
                    if (jc2.y0((File) fc2Var.next()).equalsIgnoreCase("slangp")) {
                        return obj2;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
