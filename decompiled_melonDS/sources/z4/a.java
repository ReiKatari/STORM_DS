package z4;

import java.util.List;
import java.util.NoSuchElementException;
import l4.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, i iVar, int i2) {
        String str2;
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i2 & 2) != 0) {
            str2 = "";
        } else {
            str2 = "[\n\t";
        }
        if ((i2 & 4) == 0) {
            str3 = "\n]";
        }
        if ((i2 & 32) != 0) {
            iVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            boolean z10 = true;
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            if (iVar != null) {
                sb2.append((CharSequence) iVar.k(obj));
            } else {
                if (obj != null) {
                    z10 = obj instanceof CharSequence;
                }
                if (z10) {
                    sb2.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                } else {
                    sb2.append((CharSequence) obj.toString());
                }
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
