package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u41  reason: default package */
/* loaded from: classes.dex */
public final class u41 {
    public static final List c = hf.c0(b63.A, b63.B, b63.X, b63.Y, b63.LEFT, b63.RIGHT, b63.UP, b63.DOWN, b63.L, b63.R, b63.START, b63.SELECT, b63.HINGE, b63.PAUSE, b63.FAST_FORWARD, b63.HOLD_FAST_FORWARD, b63.MICROPHONE, b63.RESET, b63.SWAP_SCREENS, b63.QUICK_SAVE, b63.QUICK_LOAD, b63.REWIND, b63.TRANSLATE);
    public final kk6 a;
    public final ArrayList b;

    public u41(List list, kk6 kk6Var) {
        Object obj;
        list.getClass();
        kk6Var.getClass();
        this.a = kk6Var;
        List<b63> list2 = c;
        ArrayList arrayList = new ArrayList(ht0.v0(list2, 10));
        for (b63 b63Var : list2) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((i63) obj).a == b63Var) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            i63 i63Var = (i63) obj;
            if (i63Var == null) {
                i63Var = new i63(b63Var, (h63) null, 6);
            }
            arrayList.add(i63Var);
        }
        this.b = arrayList;
    }

    public final u41 a() {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(i63.a((i63) obj, null, null, 7));
        }
        return new u41(arrayList2, kk6.a(this.a, null, false, 0, 0, false, false, RecyclerView.B1, 127));
    }

    public /* synthetic */ u41(List list) {
        this(list, new kk6());
    }
}
