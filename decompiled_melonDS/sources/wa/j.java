package wa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14182a;

    static {
        int i2;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i2 = Integer.parseInt(split[0]);
            if (i2 == 1 && split.length > 1) {
                i2 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i2 = -1;
        }
        if (i2 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char charAt = property.charAt(i10);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i2 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = 6;
        }
        f14182a = i2;
    }
}
