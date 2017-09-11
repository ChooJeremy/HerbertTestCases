	//Simply copy and paste this method into your ClownculatorTest.java file
	@Test
	public void testPokemon() {
		Clownculator log = new Clownculator("pokemon.txt");
		
		long salary = log.calculateSalary();
		assertEquals("pokemonTotalSalary", 123830, salary);
		
		log = new Clownculator("pokemon.txt");
		long numMinutes = log.calculateMinimumWork(123831);
		assertEquals("Pokemon income - $7911", -1, numMinutes);
		
		numMinutes = log.calculateMinimumWork(3000);
		assertEquals("Pokemon income - $3000", 1, numMinutes);
		
		numMinutes = log.calculateMinimumWork(7912);
		assertEquals("Pokemon income - $7912", 1, numMinutes);
		
		numMinutes = log.calculateMinimumWork(11000);
		assertEquals("Pokemon income - $11000", 2, numMinutes);
		
		numMinutes = log.calculateMinimumWork(15568);
		assertEquals("Pokemon income - $15568", 2, numMinutes);
		
		numMinutes = log.calculateMinimumWork(20000);
		assertEquals("Pokemon income - $20000", 3, numMinutes);
		
		numMinutes = log.calculateMinimumWork(23094);
		assertEquals("Pokemon income - $23094", 3, numMinutes);
		
		numMinutes = log.calculateMinimumWork(26000);
		assertEquals("Pokemon income - $26000", 4, numMinutes);
		
		numMinutes = log.calculateMinimumWork(30359);
		assertEquals("Pokemon income - $30359", 4, numMinutes);
		
		numMinutes = log.calculateMinimumWork(33000);
		assertEquals("Pokemon income - $33000", 5, numMinutes);
		
		numMinutes = log.calculateMinimumWork(37296);
		assertEquals("Pokemon income - $37296", 5, numMinutes);
		
		numMinutes = log.calculateMinimumWork(40000);
		assertEquals("Pokemon income - $40000", 6, numMinutes);
		
		numMinutes = log.calculateMinimumWork(43908);
		assertEquals("Pokemon income - $43908", 6, numMinutes);
		
		numMinutes = log.calculateMinimumWork(46000);
		assertEquals("Pokemon income - $46000", 7, numMinutes);
		
		numMinutes = log.calculateMinimumWork(50422);
		assertEquals("Pokemon income - $50422", 7, numMinutes);
		
		numMinutes = log.calculateMinimumWork(53000);
		assertEquals("Pokemon income - $53000", 8, numMinutes);
		
		numMinutes = log.calculateMinimumWork(56643);
		assertEquals("Pokemon income - $56643", 8, numMinutes);
		
		numMinutes = log.calculateMinimumWork(59000);
		assertEquals("Pokemon income - $59000", 9, numMinutes);
		
		numMinutes = log.calculateMinimumWork(62470);
		assertEquals("Pokemon income - $62470", 9, numMinutes);
		
		numMinutes = log.calculateMinimumWork(65000);
		assertEquals("Pokemon income - $65000", 10, numMinutes);
		
		numMinutes = log.calculateMinimumWork(67960);
		assertEquals("Pokemon income - $67960", 10, numMinutes);
		
		numMinutes = log.calculateMinimumWork(70000);
		assertEquals("Pokemon income - $70000", 11, numMinutes);
		
		numMinutes = log.calculateMinimumWork(73320);
		assertEquals("Pokemon income - $73320", 11, numMinutes);
		
		numMinutes = log.calculateMinimumWork(75000);
		assertEquals("Pokemon income - $75000", 12, numMinutes);
		
		numMinutes = log.calculateMinimumWork(78478);
		assertEquals("Pokemon income - $78478", 12, numMinutes);
		
		numMinutes = log.calculateMinimumWork(80000);
		assertEquals("Pokemon income - $80000", 13, numMinutes);
		
		numMinutes = log.calculateMinimumWork(83405);
		assertEquals("Pokemon income - $83405", 13, numMinutes);
		
		numMinutes = log.calculateMinimumWork(85000);
		assertEquals("Pokemon income - $85000", 14, numMinutes);
		
		numMinutes = log.calculateMinimumWork(88104);
		assertEquals("Pokemon income - $88104", 14, numMinutes);
		
		numMinutes = log.calculateMinimumWork(90000);
		assertEquals("Pokemon income - $90000", 15, numMinutes);
		
		numMinutes = log.calculateMinimumWork(92559);
		assertEquals("Pokemon income - $92559", 15, numMinutes);
		
		numMinutes = log.calculateMinimumWork(94000);
		assertEquals("Pokemon income - $94000", 16, numMinutes);
		
		numMinutes = log.calculateMinimumWork(96727);
		assertEquals("Pokemon income - $96727", 16, numMinutes);
		
		numMinutes = log.calculateMinimumWork(98000);
		assertEquals("Pokemon income - $98000", 17, numMinutes);
		
		numMinutes = log.calculateMinimumWork(100526);
		assertEquals("Pokemon income - $100526", 17, numMinutes);
		
		numMinutes = log.calculateMinimumWork(102000);
		assertEquals("Pokemon income - $102000", 18, numMinutes);
		
		numMinutes = log.calculateMinimumWork(104080);
		assertEquals("Pokemon income - $104080", 18, numMinutes);
		
		numMinutes = log.calculateMinimumWork(105500);
		assertEquals("Pokemon income - $105500", 19, numMinutes);
		
		numMinutes = log.calculateMinimumWork(107275);
		assertEquals("Pokemon income - $107275", 19, numMinutes);
		
		numMinutes = log.calculateMinimumWork(108500);
		assertEquals("Pokemon income - $108500", 20, numMinutes);
		
		numMinutes = log.calculateMinimumWork(110112);
		assertEquals("Pokemon income - $110112", 20, numMinutes);
		
		numMinutes = log.calculateMinimumWork(111000);
		assertEquals("Pokemon income - $111000", 21, numMinutes);
		
		numMinutes = log.calculateMinimumWork(112697);
		assertEquals("Pokemon income - $112697", 21, numMinutes);
		
		numMinutes = log.calculateMinimumWork(113000);
		assertEquals("Pokemon income - $113000", 22, numMinutes);
		
		numMinutes = log.calculateMinimumWork(114922);
		assertEquals("Pokemon income - $114922", 22, numMinutes);
		
		numMinutes = log.calculateMinimumWork(115000);
		assertEquals("Pokemon income - $115000", 23, numMinutes);
		
		numMinutes = log.calculateMinimumWork(116763);
		assertEquals("Pokemon income - $116763", 23, numMinutes);
		
		numMinutes = log.calculateMinimumWork(117000);
		assertEquals("Pokemon income - $117000", 24, numMinutes);
		
		numMinutes = log.calculateMinimumWork(118471);
		assertEquals("Pokemon income - $118471", 24, numMinutes);
		
		numMinutes = log.calculateMinimumWork(119000);
		assertEquals("Pokemon income - $119000", 25, numMinutes);
		
		numMinutes = log.calculateMinimumWork(120003);
		assertEquals("Pokemon income - $120003", 25, numMinutes);
		
		numMinutes = log.calculateMinimumWork(120500);
		assertEquals("Pokemon income - $120500", 26, numMinutes);
		
		numMinutes = log.calculateMinimumWork(121350);
		assertEquals("Pokemon income - $121350", 26, numMinutes);
		
		numMinutes = log.calculateMinimumWork(121700);
		assertEquals("Pokemon income - $121700", 27, numMinutes);
		
		numMinutes = log.calculateMinimumWork(122372);
		assertEquals("Pokemon income - $122372", 27, numMinutes);
		
		numMinutes = log.calculateMinimumWork(122800);
		assertEquals("Pokemon income - $122800", 28, numMinutes);
		
		numMinutes = log.calculateMinimumWork(123111);
		assertEquals("Pokemon income - $123111", 28, numMinutes);
		
		numMinutes = log.calculateMinimumWork(123300);
		assertEquals("Pokemon income - $123300", 29, numMinutes);
		
		numMinutes = log.calculateMinimumWork(123569);
		assertEquals("Pokemon income - $123569", 29, numMinutes);
		
		numMinutes = log.calculateMinimumWork(123600);
		assertEquals("Pokemon income - $123600", 30, numMinutes);
		
		numMinutes = log.calculateMinimumWork(123830);
		assertEquals("Pokemon income - $123830", 30, numMinutes);
	}
