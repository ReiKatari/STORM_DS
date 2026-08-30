package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends nc.l implements mc.p {
    public static final i B = new nc.l(2);

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        String str = (String) obj;
        n nVar = (n) obj2;
        if (str.length() == 0) {
            return nVar.toString();
        }
        return str + ", " + nVar;
    }
}
