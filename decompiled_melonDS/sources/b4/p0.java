package b4;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration A;
    public final /* synthetic */ g4.c B;

    public p0(Configuration configuration, g4.c cVar) {
        this.A = configuration;
        this.B = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.A;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.B.f5559a.entrySet().iterator();
        while (it.hasNext()) {
            g4.a aVar = (g4.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f5556b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.B.f5559a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        this.B.f5559a.clear();
    }
}
