
final class Class120 {

   static long[] aLongArray1631 = new long[256];
   int anInt1632;
   static int anInt1633;
   int anInt1634;
   int anInt1635;
   static Class94 aClass94_1636;
   static Class94 aClass94_1637;
   static int[] anIntArray1638;


   public static void method1731(int var0) {
      try {
         anIntArray1638 = null;
         aClass94_1637 = null;
         aClass94_1636 = null;
         aLongArray1631 = null;
         if(var0 != 12881) {
            method1732((Class11)null, (byte)-74, -125);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "qj.A(" + var0 + ')');
      }
   }

   static final Class94 method1732(Class11 var0, byte var1, int var2) {
      try {
         if(var1 >= -8) {
            anIntArray1638 = (int[])null;
         }

         return !GameClient.method44(var0).method92(var2, (byte)-110) && var0.anObjectArray314 == null?null:(null != var0.aClass94Array171 && var0.aClass94Array171.length > var2 && var0.aClass94Array171[var2] != null && ~var0.aClass94Array171[var2].method1564(1).method1540(-58) != -1?var0.aClass94Array171[var2]:(!Class69.aBoolean1040?null:Class16.method903(new Class94[]{Class121.aClass94_1645, Class72.method1298((byte)9, var2)}, (byte)-101)));
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "qj.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   static {
      for(int var2 = 0; 256 > var2; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; 8 > var3; ++var3) {
            if(~(1L & var0) != -2L) {
               var0 >>>= 1;
            } else {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
         }

         aLongArray1631[var2] = var0;
      }

      aClass94_1637 = Class3_Sub4.method108("Texturen geladen)3", (byte)-123);
      aClass94_1636 = Class3_Sub4.method108("rouge:", (byte)-124);
      anIntArray1638 = new int[128];
   }
}
