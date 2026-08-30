package h5;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f6151b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap f6152a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f6151b = hashMap;
        try {
            hashMap.put("KeyAttribute", d.class.getConstructor(null));
            hashMap.put("KeyPosition", i.class.getConstructor(null));
            hashMap.put("KeyCycle", f.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", k.class.getConstructor(null));
            hashMap.put("KeyTrigger", m.class.getConstructor(null));
        } catch (NoSuchMethodException e6) {
            Log.e("KeyFrames", "unable to load", e6);
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        HashMap hashMap;
        HashMap hashMap2;
        b kVar;
        try {
            int eventType = xmlResourceParser.getEventType();
            b bVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    if (f6151b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    kVar = new k();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    kVar = new d();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    kVar = new f();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    kVar = new i();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    kVar = new m();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                        kVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                        b(kVar);
                        bVar = kVar;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (bVar != null && (hashMap2 = bVar.f6084d) != null) {
                            i5.b.d(context, xmlResourceParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && bVar != null && (hashMap = bVar.f6084d) != null) {
                        i5.b.d(context, xmlResourceParser, hashMap);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e6) {
            Log.e("KeyFrames", "Error parsing XML resource", e6);
        } catch (XmlPullParserException e10) {
            Log.e("KeyFrames", "Error parsing XML resource", e10);
        }
    }

    public final void a(p pVar) {
        boolean z10;
        ArrayList arrayList = pVar.f6231w;
        HashMap hashMap = this.f6152a;
        ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(pVar.f6212c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = (ArrayList) hashMap.get(-1);
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                b bVar = (b) obj;
                String str = ((i5.f) pVar.f6211b.getLayoutParams()).Y;
                String str2 = bVar.f6083c;
                if (str2 != null && str != null) {
                    z10 = str.matches(str2);
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(bVar);
                }
            }
        }
    }

    public final void b(b bVar) {
        HashMap hashMap = this.f6152a;
        if (!hashMap.containsKey(Integer.valueOf(bVar.f6082b))) {
            hashMap.put(Integer.valueOf(bVar.f6082b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(bVar.f6082b));
        if (arrayList != null) {
            arrayList.add(bVar);
        }
    }
}
