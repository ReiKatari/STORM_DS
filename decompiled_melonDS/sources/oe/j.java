package oe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final List f10940b = p7.t.y(s.A, s.B, s.X, s.Y, s.LEFT, s.RIGHT, s.UP, s.DOWN, s.L, s.R, s.START, s.SELECT, s.HINGE, s.PAUSE, s.FAST_FORWARD, s.MICROPHONE, s.RESET, s.SWAP_SCREENS, s.QUICK_SAVE, s.QUICK_LOAD, s.REWIND);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10941a;

    public j(List list) {
        Object obj;
        List<s> list2 = f10940b;
        ArrayList arrayList = new ArrayList(zb.m.G(list2, 10));
        for (s sVar : list2) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((y) obj).f10962a == sVar) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            y yVar = (y) obj;
            if (yVar == null) {
                yVar = new y(sVar, (x) null, 6);
            }
            arrayList.add(yVar);
        }
        this.f10941a = arrayList;
    }
}
