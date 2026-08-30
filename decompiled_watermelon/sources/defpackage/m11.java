package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m11  reason: default package */
/* loaded from: classes.dex */
public final class m11 {
    public static final List c = l07.c0(yz2.A, yz2.B, yz2.X, yz2.Y, yz2.LEFT, yz2.RIGHT, yz2.UP, yz2.DOWN, yz2.L, yz2.R, yz2.START, yz2.SELECT, yz2.HINGE, yz2.PAUSE, yz2.FAST_FORWARD, yz2.HOLD_FAST_FORWARD, yz2.MICROPHONE, yz2.RESET, yz2.SWAP_SCREENS, yz2.QUICK_SAVE, yz2.QUICK_LOAD, yz2.REWIND);
    public final u86 a;
    public final ArrayList b;

    public m11(List list, u86 u86Var) {
        Object obj;
        list.getClass();
        u86Var.getClass();
        this.a = u86Var;
        List<yz2> list2 = c;
        ArrayList arrayList = new ArrayList(uq0.y0(list2, 10));
        for (yz2 yz2Var : list2) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((f03) obj).a == yz2Var) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            f03 f03Var = (f03) obj;
            if (f03Var == null) {
                f03Var = new f03(yz2Var, (e03) null, 6);
            }
            arrayList.add(f03Var);
        }
        this.b = arrayList;
    }

    public final m11 a() {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(f03.a((f03) obj, null, null, 7));
        }
        return new m11(arrayList2, u86.a(this.a, null, false, 0, 0, false, false, RecyclerView.A1, 127));
    }

    public /* synthetic */ m11(List list) {
        this(list, new u86());
    }
}
