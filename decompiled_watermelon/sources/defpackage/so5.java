package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: so5  reason: default package */
/* loaded from: classes.dex */
public final class so5 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ so5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float h;
        switch (this.a) {
            case 0:
                String str = ((oo5) obj).d;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((oo5) obj2).d.toLowerCase(locale);
                lowerCase2.getClass();
                return iq2.i(lowerCase, lowerCase2);
            case 1:
                return iq2.i(((rg5) obj2).g, ((rg5) obj).g);
            case 2:
                return iq2.i(Integer.valueOf(((fp5) obj).a), Integer.valueOf(((fp5) obj2).a));
            case 3:
                return iq2.i((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return iq2.i((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                w36 w36Var = (w36) obj;
                float f = -1.0f;
                if (w36Var.B.h() == RecyclerView.A1 && w36Var.f0 == null) {
                    h = -1.0f;
                } else {
                    h = w36Var.B.h();
                }
                Float valueOf = Float.valueOf(h);
                w36 w36Var2 = (w36) obj2;
                if (w36Var2.B.h() != RecyclerView.A1 || w36Var2.f0 != null) {
                    f = w36Var2.B.h();
                }
                return iq2.i(valueOf, Float.valueOf(f));
            case ig7.b /* 6 */:
                return iq2.i(Long.valueOf(((hb4) obj).i), Long.valueOf(((hb4) obj2).i));
            case 7:
                Iterator it = ((bg0) obj).b.iterator();
                if (it.hasNext()) {
                    List list = tf6.i0;
                    sn1 sn1Var = ((sf6) it.next()).h;
                    list.getClass();
                    Integer valueOf2 = Integer.valueOf(list.indexOf(sn1Var));
                    while (it.hasNext()) {
                        List list2 = tf6.i0;
                        sn1 sn1Var2 = ((sf6) it.next()).h;
                        list2.getClass();
                        Integer valueOf3 = Integer.valueOf(list2.indexOf(sn1Var2));
                        if (valueOf2.compareTo(valueOf3) < 0) {
                            valueOf2 = valueOf3;
                        }
                    }
                    Iterator it2 = ((bg0) obj2).b.iterator();
                    if (it2.hasNext()) {
                        List list3 = tf6.i0;
                        sn1 sn1Var3 = ((sf6) it2.next()).h;
                        list3.getClass();
                        Integer valueOf4 = Integer.valueOf(list3.indexOf(sn1Var3));
                        while (it2.hasNext()) {
                            List list4 = tf6.i0;
                            sn1 sn1Var4 = ((sf6) it2.next()).h;
                            list4.getClass();
                            Integer valueOf5 = Integer.valueOf(list4.indexOf(sn1Var4));
                            if (valueOf4.compareTo(valueOf5) < 0) {
                                valueOf4 = valueOf5;
                            }
                        }
                        return iq2.i(valueOf2, valueOf4);
                    }
                }
                vd6.b();
                return 0;
            case 8:
                Iterator it3 = ((bg0) obj).b.iterator();
                if (it3.hasNext()) {
                    Integer valueOf6 = Integer.valueOf(tf6.k0.indexOf(new pf6(((sf6) it3.next()).c)));
                    while (it3.hasNext()) {
                        Integer valueOf7 = Integer.valueOf(tf6.k0.indexOf(new pf6(((sf6) it3.next()).c)));
                        if (valueOf6.compareTo(valueOf7) < 0) {
                            valueOf6 = valueOf7;
                        }
                    }
                    Iterator it4 = ((bg0) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer valueOf8 = Integer.valueOf(tf6.k0.indexOf(new pf6(((sf6) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer valueOf9 = Integer.valueOf(tf6.k0.indexOf(new pf6(((sf6) it4.next()).c)));
                            if (valueOf8.compareTo(valueOf9) < 0) {
                                valueOf8 = valueOf9;
                            }
                        }
                        return iq2.i(valueOf6, valueOf8);
                    }
                }
                vd6.b();
                return 0;
            case 9:
                return iq2.i(((dm6) obj).a, ((dm6) obj2).a);
            case 10:
                return iq2.i(((fm6) obj).a, ((fm6) obj2).a);
            case 11:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return iq2.i(((qj7) obj).a, ((qj7) obj2).a);
        }
    }
}
