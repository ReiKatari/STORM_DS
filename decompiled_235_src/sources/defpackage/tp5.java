package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tp5  reason: default package */
/* loaded from: classes.dex */
public final class tp5 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ tp5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float h;
        switch (this.a) {
            case 0:
                return g04.z(Integer.valueOf(((RewindSaveState) obj2).getFrame()), Integer.valueOf(((RewindSaveState) obj).getFrame()));
            case 1:
                return g04.z(Integer.valueOf(((h3) obj).a.getDisplayOrder()), Integer.valueOf(((h3) obj2).a.getDisplayOrder()));
            case 2:
                String str = ((lz5) obj).c;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((lz5) obj2).c.toLowerCase(locale);
                lowerCase2.getClass();
                return g04.z(lowerCase, lowerCase2);
            case 3:
                String str2 = ((jz5) obj).d;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                lowerCase3.getClass();
                String lowerCase4 = ((jz5) obj2).d.toLowerCase(locale2);
                lowerCase4.getClass();
                return g04.z(lowerCase3, lowerCase4);
            case 4:
                return g04.z(((pq5) obj2).g, ((pq5) obj).g);
            case 5:
                return g04.z(Integer.valueOf(((a06) obj).a), Integer.valueOf(((a06) obj2).a));
            case 6:
                return g04.z((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return g04.z((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 8:
                if6 if6Var = (if6) obj;
                float f = -1.0f;
                if (if6Var.B.h() == RecyclerView.B1 && if6Var.g0 == null) {
                    h = -1.0f;
                } else {
                    h = if6Var.B.h();
                }
                Float valueOf = Float.valueOf(h);
                if6 if6Var2 = (if6) obj2;
                if (if6Var2.B.h() != RecyclerView.B1 || if6Var2.g0 != null) {
                    f = if6Var2.B.h();
                }
                return g04.z(valueOf, Float.valueOf(f));
            case 9:
                return g04.z(Long.valueOf(((ek4) obj).i), Long.valueOf(((ek4) obj2).i));
            case 10:
                Iterator it = ((ki0) obj).b.iterator();
                if (it.hasNext()) {
                    List list = jr6.j0;
                    vs0 vs0Var = ((ir6) it.next()).h;
                    list.getClass();
                    Integer valueOf2 = Integer.valueOf(list.indexOf(vs0Var));
                    while (it.hasNext()) {
                        List list2 = jr6.j0;
                        vs0 vs0Var2 = ((ir6) it.next()).h;
                        list2.getClass();
                        Integer valueOf3 = Integer.valueOf(list2.indexOf(vs0Var2));
                        if (valueOf2.compareTo(valueOf3) < 0) {
                            valueOf2 = valueOf3;
                        }
                    }
                    Iterator it2 = ((ki0) obj2).b.iterator();
                    if (it2.hasNext()) {
                        List list3 = jr6.j0;
                        vs0 vs0Var3 = ((ir6) it2.next()).h;
                        list3.getClass();
                        Integer valueOf4 = Integer.valueOf(list3.indexOf(vs0Var3));
                        while (it2.hasNext()) {
                            List list4 = jr6.j0;
                            vs0 vs0Var4 = ((ir6) it2.next()).h;
                            list4.getClass();
                            Integer valueOf5 = Integer.valueOf(list4.indexOf(vs0Var4));
                            if (valueOf4.compareTo(valueOf5) < 0) {
                                valueOf4 = valueOf5;
                            }
                        }
                        return g04.z(valueOf2, valueOf4);
                    }
                }
                fa6.c();
                return 0;
            case 11:
                Iterator it3 = ((ki0) obj).b.iterator();
                if (it3.hasNext()) {
                    Integer valueOf6 = Integer.valueOf(jr6.l0.indexOf(new fr6(((ir6) it3.next()).c)));
                    while (it3.hasNext()) {
                        Integer valueOf7 = Integer.valueOf(jr6.l0.indexOf(new fr6(((ir6) it3.next()).c)));
                        if (valueOf6.compareTo(valueOf7) < 0) {
                            valueOf6 = valueOf7;
                        }
                    }
                    Iterator it4 = ((ki0) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer valueOf8 = Integer.valueOf(jr6.l0.indexOf(new fr6(((ir6) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer valueOf9 = Integer.valueOf(jr6.l0.indexOf(new fr6(((ir6) it4.next()).c)));
                            if (valueOf8.compareTo(valueOf9) < 0) {
                                valueOf8 = valueOf9;
                            }
                        }
                        return g04.z(valueOf6, valueOf8);
                    }
                }
                fa6.c();
                return 0;
            case 12:
                return g04.z(((ny6) obj).a, ((ny6) obj2).a);
            case 13:
                return g04.z(((py6) obj).a, ((py6) obj2).a);
            case 14:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return g04.z(((jy7) obj).a, ((jy7) obj2).a);
        }
    }
}
