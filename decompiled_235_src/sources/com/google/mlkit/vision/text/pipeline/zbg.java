package com.google.mlkit.vision.text.pipeline;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaw;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbg {
    public static String zba(List list) {
        Iterator it = list.iterator();
        float f = RecyclerView.B1;
        String str = "und";
        while (it.hasNext()) {
            zbaaw zbaawVar = (zbaaw) it.next();
            if (f < zbaawVar.zbc()) {
                f = zbaawVar.zbc();
                str = zbaawVar.zbf();
            }
        }
        return str;
    }
}
